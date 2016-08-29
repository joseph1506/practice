package practice.servicelocator;

import practice.servicelocator.lookup.InitialContext;
import practice.servicelocator.lookup.ServiceCache;
import practice.servicelocator.service.Service;

public class ServiceLocator {
    private static ServiceCache cache=new ServiceCache();

    public static Service getService(String jndiName){
        Service service=cache.getService(jndiName);
        if(service!=null){
            return service;
        }
        InitialContext context= new InitialContext();
        Service newService=(Service)context.lookup(jndiName);
        if(newService!=null){
            cache.addService(newService);
            return newService;
        }
        return null;
    }
}
