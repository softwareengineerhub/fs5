package com.app.core.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyDog {
    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private int age;

    public MyDog() {
        System.out.println("MyDog.Constructor.name="+name+"; age="+age);
    }

    @PostConstruct
    public void myInit(){
        System.out.println("MyDog.myInit()");
        System.out.println("MyDog.myInit().name="+name+"; age="+age);

    }

    public void init(){
        System.out.println("MyDog.init()");
        System.out.println("MyDog.init().name="+name+"; age="+age);
    }

    @Override
    public String toString() {
        return "MyDog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
