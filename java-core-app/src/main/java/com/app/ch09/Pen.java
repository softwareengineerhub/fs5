package com.app.ch09;

public abstract class Pen {

    public Pen(){
        System.out.println("Pen constructor");
    }

    public void process(){
        System.out.println("@Before action");
        long start = System.currentTimeMillis();
        doAction();
        System.out.println("@After action. "+(System.currentTimeMillis()-start));
    }

    public abstract void doAction();

}
