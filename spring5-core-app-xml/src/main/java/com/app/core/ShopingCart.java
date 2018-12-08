package com.app.core;

public class ShopingCart {
    private String name;
    private int sum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "ShopingCart{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                '}';
    }
}
