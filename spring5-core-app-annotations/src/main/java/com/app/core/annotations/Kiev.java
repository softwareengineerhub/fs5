package com.app.core.annotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Named;

@Named
public class Kiev implements City {

    @PostConstruct
    public static void myMethod() throws Exception {
        System.out.println("Kiev.@PostConstruct");
    }

    public void printInfo() {
        System.out.println("Kiev");
    }
}
