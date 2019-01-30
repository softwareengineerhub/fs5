package com.app.feed.config;

import org.springframework.stereotype.Component;

@Component
public class Person implements PersonMBean {
    //attribute
    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    //operation
    @Override
    public void doAction() {
        System.out.println("name="+name+"; age="+age);
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
