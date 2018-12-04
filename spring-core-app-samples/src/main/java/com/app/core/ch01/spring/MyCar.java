package com.app.core.ch01.spring;

public class MyCar {
    private String name;
    private int age;

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
        return "MyCar{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
