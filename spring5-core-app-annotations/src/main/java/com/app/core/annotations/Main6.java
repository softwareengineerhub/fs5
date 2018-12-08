package com.app.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main6 {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");
        CityProcessor cityProcessor = ctx.getBean(CityProcessor.class);


        cityProcessor.processCity();

    }
}
