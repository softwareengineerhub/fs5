package com.app.publisher;

import com.app.config.Producer1Config;
import com.app.config.Producer2Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Publisher2 {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Producer2Config.class);
        PublisherService2 publisherService2 = ctx.getBean(PublisherService2.class);
        publisherService2.sendMessage();
    }
}
