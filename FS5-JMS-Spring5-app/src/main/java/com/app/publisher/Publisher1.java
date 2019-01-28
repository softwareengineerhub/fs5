package com.app.publisher;


import com.app.config.MyConfigQueue;
import com.app.config.Producer1Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Publisher1 {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Producer1Config.class);
        PublisherService publisherService = ctx.getBean(PublisherService.class);
        publisherService.sendMessage();
    }
}
