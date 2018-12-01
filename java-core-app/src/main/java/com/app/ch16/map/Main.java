package com.app.ch16.map;

import com.app.ch16.set.MyDog;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map map = new HashMap();
        for(int i=0;i<10;i++){
            MyDog dog = new MyDog();
            dog.setAge(i);
            dog.setName("Name"+i);
            map.put(dog, "Index="+i);
        }
        System.out.println(map);
        System.out.println(map.size());
        MyDog dog = new MyDog();
        dog.setAge(0);
        dog.setName("Name"+0);
        Object oldValue = map.put(dog, "UpdatedValue");
        System.out.println(oldValue);
        //set.add(dog);
        System.out.println(map);
        System.out.println(map.size());

    }

}
