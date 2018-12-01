package com.app.ch01;

public class Main {

    public static void main(String[] args) {
        //Parent parent1 = new Parent();
        //Parent parent2 = new Parent();
        //Child child = new Child();
        //SubChild subChild = new SubChild();
        Parent p  = new Child();
        Parent p2  = new SubChild();
        //SubChild p3 = (SubChild) new Parent();
        //SubChild p3 = (SubChild) p2;
    }
}
