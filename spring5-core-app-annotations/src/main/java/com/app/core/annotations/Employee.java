package com.app.core.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component(value = "emp1")
public class Employee {
    @Value("${emp.name}")
    private String name;
    @Value("${emp.age}")
    private int age;

    public Employee() {
        System.out.println("Employee.Constructor");
    }

   // @PostConstruct
    public void init(){
        System.out.println("Employee.init()");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
