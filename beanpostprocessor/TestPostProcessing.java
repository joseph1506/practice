package practice.beanpostprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestPostProcessing {

    @Autowired
    private Commodity playStation;

    @Autowired
    private Commodity xBox;


    @RequestMapping(method = RequestMethod.GET,value="/test/PostProcessor")
    public void testPostProcessor(){
         System.out.println(playStation.toString());
        System.out.println(xBox.toString());
    }






}
