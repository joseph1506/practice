package practice.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestAOPClass {

    @Autowired
    Performer performer;

    @Autowired
    Thinker thinker;

    @Autowired
    MindReader psychic;

    public void firstMethod(){
        System.out.println("inside first Method");
    }

    public void secondMethod(){
        System.out.println("inside second Method");
    }

    public void thirdMethod() throws Exception {
        System.out.println("inside third method");
        throw new Exception("from third method");
    }

    @RequestMapping(method = RequestMethod.GET,value = "/test/callMethods")
    public void callInternalMethods() throws Exception {
        firstMethod();
        secondMethod();
        thirdMethod();
    }


    @RequestMapping(method=RequestMethod.GET,value="/test/aopMethod")
    public void callPerformerToPerform() throws Exception {
        performer.perform();
    }

    @RequestMapping(method=RequestMethod.GET,value="/test/psychic")
    public void psychicInAction() throws Exception {
        thinker.thinkOfSomething("You are no Psychic");
        System.out.println("Your thoughts are ---->"+psychic.getThoughts());
    }
}
