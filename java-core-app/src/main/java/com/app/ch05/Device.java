package com.app.ch05;

public class Device {
    private String name;
    int price;
    protected String model;
    public int year;
    private static String manufacture;
    public static String manufacturePublic;
    public static int size=10;
    public int width=100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
