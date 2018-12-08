package com.app.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        MyService myService = (MyService) ctx.getBean("myService");
        MyService myService2 = ctx.getBean(MyService.class);
        myService.doAction();
        myService2.doAction();
        System.out.println(myService.hashCode());
        System.out.println(myService2.hashCode());
    }
}
