package com.app.ch20;

import java.util.List;

public class Main3Collections {

    public static void main(String[] args) {

    }

    public void prodcueItem(List<? super MyCar> list){
        //list.add("");
        list.add(new MyCar());
        list.add(new BMWCar());
        //list.add(new Object());
    }

    public void consumeItem(List<? extends MyCar> list){
        MyCar myCar = list.get(0);
        Object obj = myCar;
        System.out.println(myCar);
    }

}
