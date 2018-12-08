package com.app.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");
        Country country = ctx.getBean(Country.class);
        country.showInfo();
        country = ctx.getBean("germany", Country.class);
        country.showInfo();
        System.out.println("-----------------------");
        CountryService countryService = ctx.getBean(CountryService.class);
        countryService.processCountry();

    }
}
