package com.app.ch17;

import com.app.ch16.set.MyDog;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        MyDog dog = main.readDog();
        System.out.println(dog);
    }

    private MyDog readDog(){
        try {
            InputStream in =this.getClass().getResourceAsStream("/data.properties");
            Properties props = new Properties();
            props.load(in);
            String name=props.getProperty("mydog.name");
            String ageValue=props.getProperty("mydog.age");
            int age=Integer.parseInt(ageValue);
            MyDog dog = new MyDog();
            dog.setName(name);
            dog.setAge(age);
            return dog;
        } catch (IOException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
