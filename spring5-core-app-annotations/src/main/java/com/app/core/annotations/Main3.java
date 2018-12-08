package com.app.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        Employee employee1 = (Employee) ctx.getBean("emp1");
        Employee employee2 = (Employee) ctx.getBean("emp2");
        Employee employee3 = (Employee) ctx.getBean("emp3");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
