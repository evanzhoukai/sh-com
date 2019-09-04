package cn.sh.test0801;

import lombok.Data;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQPrefetchPolicy;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author hzk
 * @date 2018/3/31
 */
public class ProducePool {

    private String user = ActiveMQConnection.DEFAULT_USER;
    private String password = ActiveMQConnection.DEFAULT_PASSWORD;
    private String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    private String subject = "mytopic";
    private Destination destination = null;
    private Connection connection = null;
    private Session session = null;
    private MessageProducer messageProducer = null;
    private String queue = "zhoukai";
    MessageProducer producer = null;
    MessageConsumer consumer = null;


    /**
     * 初始化
     *
     * @throws JMSException
     */
    public void initialize() throws JMSException {

        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(user, password, url);
        connection = activeMQConnectionFactory.createConnection();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        destination = session.createTopic(subject);
        producer = session.createProducer(destination);
        producer.setDeliveryMode(DeliveryMode.PERSISTENT);
    }


    public void initializeQueue() throws JMSException {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(user, password, url);
        connection = activeMQConnectionFactory.createConnection();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        destination = session.createQueue(queue);
        producer = session.createProducer(destination);
        // producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
    }

    public Session produceMessageQueueSession(String message) throws JMSException {
        initializeQueue();
        TextMessage textMessage = session.createTextMessage(message);
        connection.start();
        System.out.println("Producer -> Send Message:" + message);
        producer.send(textMessage);
        System.out.println("Producer -> Send Message complete!");
        return session;
    }

    public void produceMessageQueue(String message) throws JMSException {

        TextMessage textMessage = session.createTextMessage(message);
        connection.start();
        // System.out.println("Producer -> Send Message:" + message);
        producer.send(textMessage);
        // System.out.println("Producer -> Send Message complete!");
    }


    /**
     * 发送消息
     *
     * @param message
     * @throws JMSException
     */
    public void produceMessage(String message) throws JMSException {
        initialize();
        TextMessage textMessage = session.createTextMessage(message);
        connection.start();
        System.out.println("Producer -> Send Message:" + message);
        producer.send(textMessage);
        System.out.println("Producer -> Send Message complete!");
    }

    public void close() throws JMSException {
        System.out.println("Producer -> close connection!");
        if (producer != null) {
            producer.close();
        }
        if (session != null) {
            session.close();
        }
        if (connection != null) {
            connection.close();
        }
    }


    public void initializeConsumer() throws JMSException {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(user, password, url);
        connection = activeMQConnectionFactory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
        destination = session.createTopic(subject);
    }

    public void initializeConsumerQueue() throws JMSException {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(user, password, url);
        ActiveMQPrefetchPolicy prefetchPolicy = new ActiveMQPrefetchPolicy();
        prefetchPolicy.setQueueBrowserPrefetch(1);
        activeMQConnectionFactory.setPrefetchPolicy(prefetchPolicy);
        connection = activeMQConnectionFactory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
        destination = session.createQueue(queue);
    }


    public void consumerMessage(String thread) throws JMSException {
        initializeConsumer();
        consumer = session.createConsumer(destination);
        consumer.setMessageListener(new Listener(thread));
    }

    public void consumerMessageQueue(String thread) throws JMSException {
        initializeConsumerQueue();
        consumer = session.createConsumer(destination);
        consumer.setMessageListener(new Listener(thread));
    }


    @Data
    public class Listener implements MessageListener {

        private String thread;

        public Listener(String thread) {
            this.thread = thread;
        }

        @Override
        public void onMessage(Message message) {
            if (message instanceof TextMessage) {
                try {
                    //Thread.sleep(3000);
                    String text = ((TextMessage) message).getText();
                    System.out.println("消费者: 【" + thread + " 】拿到消息====:" + text);
                    //int i = 1 / 0;
                    message.acknowledge();
                } catch (Exception e) {
                    System.out.println("消费者: 【" + thread + " 】拿到消息====，但是处理失败了。 ");
                }
            }
        }
    }

}

