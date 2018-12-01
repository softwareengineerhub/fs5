package com.app.ch02;

public class Dog extends Animal {

    public void bark(){
        System.out.println("Dog bark");
    }

    @Override
    public void eat(){
        System.out.println("This is dog eat");
    }
}
