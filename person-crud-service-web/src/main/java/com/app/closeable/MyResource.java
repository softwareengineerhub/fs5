package com.app.closeable;

public class MyResource implements AutoCloseable {

    public MyResource() {
        System.out.println("Inside Constructor");
        //String s = null;
        //s.toUpperCase();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close!!!");
    }
}
