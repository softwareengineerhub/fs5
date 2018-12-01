package com.app.ch05;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car() {

    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void printName(){
        System.out.println("Name="+name);
    }

}
