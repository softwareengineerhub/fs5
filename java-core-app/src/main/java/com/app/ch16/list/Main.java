package com.app.ch16.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List list = new LinkedList();
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        List list2 = new ArrayList();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        System.out.println(list);
        System.out.println(list.hashCode());
        System.out.println(list2.hashCode());

        Object item = list.get(0);
        System.out.println(item);

        Object removeValue=list.remove(1);
        System.out.println(removeValue);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Object oldValue=list.set(0, "E");
        System.out.println(oldValue);
        System.out.println(list);

    }
}
