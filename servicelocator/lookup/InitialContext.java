package practice.servicelocator.lookup;

import practice.servicelocator.service.impl.AddService;
import practice.servicelocator.service.impl.RetrievalService;

public class InitialContext {
    public Object lookup(String jndiName){
        if("AddService".equalsIgnoreCase(jndiName)){
            return new AddService();
        }
        if("RetrievalService".equalsIgnoreCase(jndiName)){
            return new RetrievalService();
        }
        return null;
    }
}
