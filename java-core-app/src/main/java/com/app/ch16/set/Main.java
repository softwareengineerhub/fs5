package com.app.ch16.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
       // Set set = new TreeSet();
        Set set = new LinkedHashSet();
        set.add("A");
        set.add("B");
        set.add("C");
        //set.add(new Object());

        //Set set2 = new TreeSet();
        Set set2 = new LinkedHashSet();
        set2.add("A");
        set2.add("B");
        set2.add("C");

        System.out.println(set.hashCode());
        System.out.println(set2.hashCode());

        System.out.println(set2.size());

        set2.remove("B");
        System.out.println(set2);

        for(Object obj: set2){
            System.out.println(obj);
        }

        set2.add("Q");
        set2.add("Q");

        System.out.println(set2);
    }
}
