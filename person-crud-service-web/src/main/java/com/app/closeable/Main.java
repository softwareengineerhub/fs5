package com.app.closeable;

public class Main {

    public static void main(String[] args) {

        try(MyResource myResource = new MyResource();
            MyResource2 myResource2 = new MyResource2();
        ){
            System.out.println("Inside try");



        } catch (Exception e) {
            System.out.println("Inside catch");
            //e.printStackTrace();
        }

    }
}
