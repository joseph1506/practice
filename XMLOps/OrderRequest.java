package practice.XMLOps;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name="OrderRequest")
public class OrderRequest {

    public OrderRequest() {
    }


    private String orderRequestId;
    private String orderName;

    private Attribute attribute;

    private XMLGregorianCalendar signedDate;

    @XmlElement(name="orderRequestName")
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @XmlElement(name="orderRequestId")
    public String getOrderRequestId() {
        return orderRequestId;
    }

    public void setOrderRequestId(String orderRequestId) {
        this.orderRequestId = orderRequestId;
    }

    @XmlElement(name="signedDate")
    public XMLGregorianCalendar getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(XMLGregorianCalendar signedDate) {
        this.signedDate = signedDate;
    }

    @XmlElement(name="attribute")
    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
