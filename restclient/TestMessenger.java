package practice.restclient;

import com.bt.andes.sqe.multisite.bulkconfig.model.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class TestMessenger {

    private static String endPointURI="http://localhost:8080/RestService/webapi/messages";

    @Autowired
    private RestTemplate httpJsonRestTemplate;

    @RequestMapping(method = RequestMethod.GET, value = "/testMessenger")
    public
    @ResponseBody
    JsonData testMessenger() throws Exception {
        String messages=httpJsonRestTemplate.getForObject(endPointURI,String.class);
        Message message2=httpJsonRestTemplate.getForObject(endPointURI+"/1",Message.class);
        return JsonData.PARTIAL_SUCCESS_RESPONSE("");
    }
}
