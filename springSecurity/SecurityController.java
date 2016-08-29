package practice.springSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/security")
public class SecurityController {


    @RequestMapping(method= RequestMethod.GET,value="/test")
    public void securityTesting() throws Exception {
        System.out.println("inside security");
    }



}
