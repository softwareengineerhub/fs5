package com.app.ch16.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

    public static void main(String[] args) {
        //Set set = new LinkedHashSet();
        //Set set = new HashSet();
        Set set = new TreeSet();
        for(int i=0;i<10;i++){
            MyDog dog = new MyDog();
            dog.setAge(i);
            dog.setName("Name"+i);
            set.add(dog);
        }
        System.out.println(set);
        System.out.println(set.size());
        MyDog dog = new MyDog();
        dog.setAge(0);
        dog.setName("Name"+0);
        set.add(dog);
        System.out.println(set);
        System.out.println(set.size());

        System.out.println("----------------------");
        for(Object item: set){
            System.out.println(item+"; hashCode="+item.hashCode());
        }
    }
}
