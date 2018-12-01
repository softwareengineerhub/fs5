package com.app.ch14;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List list = new ArrayList();
        int j=0;
        for(int i=0;i<100;i++){
            try {
                list.add(new byte[1024 * 1024 * 100]);
            }catch(Throwable th){
                j++;
            }
        }
        System.out.println(list.size());
        System.out.println(j);
    }
}
