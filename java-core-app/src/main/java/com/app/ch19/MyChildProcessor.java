package com.app.ch19;

public class MyChildProcessor extends MyParentProcessor {

    //Coveriant
    @Override
    public MyChildA process() {
        return new MyChildA();
    }
}
