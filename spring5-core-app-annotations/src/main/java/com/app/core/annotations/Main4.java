package com.app.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");
        MyDog myDog = (MyDog) ctx.getBean("myDog");
        System.out.println(myDog);

    }
}
