package practice.springaop;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class Performer {

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public void perform() throws Exception {
        System.out.println("tein tein tein ta ta ta guitar");
        /*throw new Exception();*/
    }
}
