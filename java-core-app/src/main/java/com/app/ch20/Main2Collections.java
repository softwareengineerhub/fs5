package com.app.ch20;

import java.util.ArrayList;
import java.util.List;

public class Main2Collections {

    public static void main(String[] args) {
        List<MyCar> myCarList = new ArrayList();
        myCarList.add(new BMWCar());
        //myCarList.add("");
        fakeGenerics(myCarList, "ABC");
        System.out.println(myCarList);
    }

    public static void fakeGenerics(List list, Object item){
        list.add(item);
    }

}
