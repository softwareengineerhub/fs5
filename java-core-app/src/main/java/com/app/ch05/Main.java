package com.app.ch05;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        //car.name="";
        car.setName("Car1");
        car.printName();

        Car car2 = new Car("Car2");
        car2.printName();
        System.out.println("----Default----");
        Device device = new Device();
        device.setName("HTC");
        device.price=1000;
        device.model="M1";


        //Device.manufacturePublic;

        Person p = Person.getInstance();

    }
}
