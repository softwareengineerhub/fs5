package com.app.core.ch01.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*
        MyDog myDog = (MyDog) ctx.getBean("a");
        MyDog myDog1 = (MyDog) ctx.getBean("b");
        MyDog myDog2 = (MyDog) ctx.getBean("c");
        System.out.println(myDog);
        System.out.println(myDog1);
        System.out.println(myDog2);
        System.out.println("----------------------");
        myDog = (MyDog) ctx.getBean("a1");
        myDog1 = (MyDog) ctx.getBean("b1");
        myDog2 = (MyDog) ctx.getBean("c1");
        System.out.println(myDog);
        System.out.println(myDog1);
        System.out.println(myDog2);
        System.out.println("------------------------");*/

    }
}
