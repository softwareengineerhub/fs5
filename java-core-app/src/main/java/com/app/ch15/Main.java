package com.app.ch15;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] array = new String[10];
        array[0] = "A";
        for(String it: array){

        }
        for(int i=0;i<array.length;i++){
            //array[i];
        }
        System.out.println(array);
        System.out.println(Arrays.toString(array));
       // Arrays.hashCode(array);
        System.out.println("-------hashCode--------");
        System.out.println(array.hashCode());
        System.out.println(Arrays.hashCode(array));
        array[1]="B";
        System.out.println(array.hashCode());
        System.out.println(Arrays.hashCode(array));

    }
}
