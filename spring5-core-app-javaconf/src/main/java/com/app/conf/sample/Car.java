package com.app.conf.sample;

import javax.annotation.PostConstruct;

public class Car {

    @PostConstruct
    public void init(){
        System.out.println("Car.init()");
    }

    public void myInit(){
        System.out.println("Car.myInit()");
    }

    public void printInfo(){
        System.out.println("Car");
    }
}
