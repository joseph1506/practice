package practice.springbeanwiring;

import com.bt.andes.sqe.multisite.bulkconfig.model.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import practice.springbeanwiring.serviceLocator.ParserBean;

@Controller
public class TestFactoryWiring {

    /*@Autowired
    PostService postService;

    @Autowired
    DeliveryService deliveryService;*/

    @Autowired
    ParserBean parserBean;


    @RequestMapping(method = RequestMethod.GET, value = "/test/springfactory")
    public
    @ResponseBody
    JsonData testFactory() throws Exception {
        parserBean.testParser();
        return JsonData.PARTIAL_SUCCESS_RESPONSE("");
    }
}
