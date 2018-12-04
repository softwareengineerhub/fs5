package com.app.core.ch01.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyCar myCar = ctx.getBean("myCar", MyCar.class);
        System.out.println(myCar);
        System.out.println("----------");
        MySTO mySTO = (MySTO) ctx.getBean("mySTO");
        System.out.println(mySTO);
    }
}
