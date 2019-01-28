package com.app.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.TextMessage;

@Component
public class MyJMSListener2 {

    @JmsListener(destination = "applicationQueue1")
    public void onMessage(Message message){
        try {
            if (message instanceof TextMessage) {
                TextMessage msg = (TextMessage) message;
                String text = msg.getText();
                System.out.println("Listener2: Text=" + text);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
