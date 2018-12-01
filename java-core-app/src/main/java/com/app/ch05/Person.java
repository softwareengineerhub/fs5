package com.app.ch05;

public class Person {
    private String name;
    private int age;
    private static Person instance;


    private Person(){

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


    public static Person getInstance(){
        //name="";
        if(instance==null){
            instance = new Person();
        }
        return instance;
    }
}
