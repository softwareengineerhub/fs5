package com.app.ch08;

public class Computer {
   // public final String name = "MyComputer";
    public final String name;
    public int price;

    /*{
        name = "Name1";
    }*/


    public Computer(String name) {
        this.name = name;
    }


    public final  void process(){
        System.out.println("Computer process");
    }
}
