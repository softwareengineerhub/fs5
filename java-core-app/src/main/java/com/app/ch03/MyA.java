package com.app.ch03;

public class MyA {

    public MyA(){
        this("100");
        System.out.println("END Default parameter");
    }

    public MyA(int type){

        System.out.println("END Integer parameter");
    }

    public MyA(String name){

        //this(name);
        //System.out.println("END String parameter ");
        this(Integer.parseInt(name));
        System.out.println("END String parameter ");
    }
}
