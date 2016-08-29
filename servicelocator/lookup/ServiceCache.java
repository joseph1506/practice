package practice.servicelocator.lookup;

import practice.servicelocator.service.Service;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class ServiceCache {
    private List<Service> services;

    public ServiceCache(){
        services= newArrayList();
    }
    public Service getService(String jndiName){
        for(Service service:services){
            if(service.getName().equalsIgnoreCase(jndiName)){
                return service;
            }
        }
       return null;
    }

    public void addService(Service service){
        boolean isServicePresent=false;

        for(Service serviceIncluded:services){
             if(serviceIncluded.getName().equalsIgnoreCase(service.getName())){
                 isServicePresent=true;
             }
        }

        if(!isServicePresent){
            services.add(service);
        }
    }
}
