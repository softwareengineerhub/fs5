package com.app.ch01;

public class Parent {

    static{
        System.out.println("Parent. Static block1");
    }

    {System.out.println("Parent. block1");}

    {System.out.println("Parent. block2");}

    public Parent(){
        System.out.println("Parent constructor");
    }

    static{
        System.out.println("Parent. Static block2");

    }

}
