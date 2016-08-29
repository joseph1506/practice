package practice.springcaching;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable("Greetings")
    public String fetchGreeting(String name){
        System.out.println("Inside cache Method--- name---->"+name);
       return "Good Morning "+name;
    }


    @Cacheable(value = "UserCreds",key = "#name")
    public String setAndGetCredentials(String name,boolean isPrivileged){
        System.out.println("inside fetchDetails---name---->"+name);
        System.out.println("inside fetchDetails---privileged---->"+isPrivileged);
        if(isPrivileged){
            return name+"-Admin";
        }
        return name+"-User";
    }

}
