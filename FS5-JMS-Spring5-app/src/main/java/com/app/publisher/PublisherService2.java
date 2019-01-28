package com.app.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Component
public class PublisherService2 {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(){
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                Message msg = session.createTextMessage("Message from Producer2");
                return msg;
            }
        });
    }

}
