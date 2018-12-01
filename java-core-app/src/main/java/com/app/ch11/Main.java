package com.app.ch11;

public class Main {

    public static void main(String[] args) {
        System.out.println(Constants.TUESDAY);
        System.out.println("----------------");
        System.out.println(MyDaysOfWeek.TUESDAY.toString());
        System.out.println(MyDaysOfWeek.TUESDAY.name());
    }

    public void m(){
        /*public enum MyDataInMethod{
            A,B,C
        } */
    }

    private enum MyData {
        A,B,C
    }
}
