package com.app.closeable;

public class MyResource2 implements AutoCloseable {

    public MyResource2() {
        System.out.println("Inside Constructor2");
        //String s = null;
        //s.toUpperCase();
        String s = null;
        s.toUpperCase();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close2!!!");
    }
}
