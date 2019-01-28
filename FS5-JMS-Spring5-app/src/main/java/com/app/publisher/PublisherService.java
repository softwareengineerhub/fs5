package com.app.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service
public class PublisherService {
    @Autowired
    private ConnectionFactory connectionFactory;
    @Autowired
    private Destination destination;

    public void sendMessage(){
        try {
            Connection c = connectionFactory.createConnection();
            Session session = c.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Message msg = session.createTextMessage("This is JMS");
            MessageProducer producer = session.createProducer(destination);
            producer.send(msg);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
