package practice.activeMQ;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class MessageListenerTest implements MessageListener {
    @Override
    public void onMessage(Message message) {
        if(message instanceof TextMessage){
            TextMessage text=(TextMessage) message;
            try {
                String textMessage=text.getText();
                System.out.println("Message Got is ---------->"+textMessage);
            } catch (JMSException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }


    public static void main(String[] args) throws JMSException {
        MessageListenerTest consumer= new MessageListenerTest();
        consumer.subscribe();
    }

    private void subscribe() throws JMSException {
        ConnectionFactory factory= new ActiveMQConnectionFactory("admin","admin","tcp://BANTM214503970:61616");
        Connection connection= factory.createConnection();
        Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        Queue queue=session.createQueue("JO_QUEUE_VERUTHE");
        MessageConsumer consumer=session.createConsumer(queue);
        consumer.setMessageListener(this);
        connection.start();
        while(true){

        }
    }

}
