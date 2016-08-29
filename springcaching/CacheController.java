package practice.springcaching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CacheController {

    @Autowired
    private CacheService service;

    private static String nameJoseph="Joseph";
    private static String nameRandom="Random";

    @RequestMapping(method= RequestMethod.GET,value="/test/caching")
    public void callCacheMethod() throws Exception {

        String greeting1=service.fetchGreeting(nameJoseph);
        String greeting2=service.fetchGreeting(nameRandom);
        String greeting3=service.fetchGreeting(nameJoseph);
        String greeting4=service.fetchGreeting(nameRandom);
        String greeting5=service.fetchGreeting(nameJoseph);

        System.out.println("greeting1--->"+greeting1);
        System.out.println("greeting2--->"+greeting2);
        System.out.println("greeting3--->"+greeting3);
        System.out.println("greeting4--->"+greeting4);
        System.out.println("greeting5--->"+greeting5);
    }


    @RequestMapping(method= RequestMethod.GET,value="/test/customCaching")
    public void callCustomCacheMethod() throws Exception {

        String cred1=service.setAndGetCredentials(nameJoseph,true);
        String cred2=service.setAndGetCredentials(nameRandom,false);
        String cred3=service.setAndGetCredentials(nameJoseph,false);
        String cred4=service.setAndGetCredentials(nameRandom,true);


        System.out.println("cred1--->"+cred1);
        System.out.println("cred2--->"+cred2);
        System.out.println("cred3--->"+cred3);
        System.out.println("cred4--->"+cred4);

    }

}
