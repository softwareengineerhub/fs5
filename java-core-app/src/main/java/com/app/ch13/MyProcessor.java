package com.app.ch13;

public class MyProcessor {

    public void increasePopulation(MyCountry myCountry){
        int current = myCountry.getPopulation();
        myCountry.setPopulation(current+10);
    }

    public void increasePopulation2(MyCountry myCountry){
        int current = myCountry.getPopulation();
        myCountry.setPopulation(current+10);

        myCountry = new MyCountry();
        myCountry.setPopulation(200);
    }

    public MyCountry increasePopulation3(MyCountry myCountry){
        int current = myCountry.getPopulation();
        myCountry.setPopulation(current+10);

        myCountry = new MyCountry();
        myCountry.setPopulation(300);
        return myCountry;
    }

    public void changeNumber(int value){
        value++;
        System.out.println("Inside method. value="+value);
    }
}
