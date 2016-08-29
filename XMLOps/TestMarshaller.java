package practice.XMLOps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.xml.transform.StringResult;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

@Controller
public class TestMarshaller {

    @Autowired
    Marshaller customMarshaller;


    @RequestMapping(method = RequestMethod.GET,value = "/test/xmlOps")
    public void callInternalMethods() throws Exception {
        XMLGregorianCalendar date2=null;
        Date dob = null;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {

            dob = df.parse("13/06/1983");

            GregorianCalendar c = new GregorianCalendar();
            c.setTimeInMillis(dob.getTime());
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            System.out.println(date2);
        }
        catch(DatatypeConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch(ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




        OrderRequest orderRequest= new OrderRequest();
        orderRequest.setOrderName("order1");
        orderRequest.setOrderRequestId("123344");
        orderRequest.setSignedDate(date2);

        Attribute attribute= new Attribute();
        attribute.setName("att1");
        attribute.setValue("val1");

        orderRequest.setAttribute(attribute);

        StringResult result= new StringResult();
        customMarshaller.marshal(orderRequest,result);

        System.out.println("XML---->"+result.toString());
    }
}
