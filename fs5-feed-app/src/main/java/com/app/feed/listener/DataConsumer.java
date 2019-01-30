package com.app.feed.listener;

import javax.jms.Message;
import javax.jms.MessageListener;

public class DataConsumer implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            //Thread.sleep(5000);
            System.out.println(message);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
