package practice.activeMQ;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class MessageProducerTest {

    public static void main(String[] args) throws JMSException {

        ConnectionFactory factory= new ActiveMQConnectionFactory("admin","admin","tcp://BANTM214503970:61616");
        Connection connection= factory.createConnection();
        Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        Queue queue=session.createQueue("JO_QUEUE_VERUTHE");
        MessageProducer producer=session.createProducer(queue);
        TextMessage message=session.createTextMessage();
        message.setText("Poda thendi");
        producer.send(message);
    }

}
