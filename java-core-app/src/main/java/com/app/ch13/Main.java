package com.app.ch13;

public class Main {

    public static void main(String[] args) {
        MyCountry myCountry = new MyCountry();
        MyProcessor processor = new MyProcessor();

        processor.increasePopulation(myCountry);
        System.out.println(myCountry);
        processor.increasePopulation2(myCountry);
        System.out.println(myCountry);
        myCountry=processor.increasePopulation3(myCountry);
        System.out.println(myCountry);
        System.out.println("--------------");
        int t=5;
        processor.changeNumber(t);
        System.out.println("t="+t);
        System.out.println("-------------");
        String s = "abc";
        s.toUpperCase();
        System.out.println(s);
        s=s.toUpperCase();
        System.out.println(s);
    }

}
