package com.app.ch01;

public class Child extends Parent {

    static{
        System.out.println("\tChild. Static block1");
    }

    {System.out.println("\tChild. block1");}

    {System.out.println("\tChild. block2");}

    public Child(){
        System.out.println("\tChild constructor");
    }

    static{
        System.out.println("\tChild. Static block2");

    }

}
