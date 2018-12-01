package com.app.ch04;

public class Main4 {

    public static void main(String[] args) {
        Producer p = new Producer();
        p.doProduce();
        System.out.println("--------------");
        Consumer c = new Consumer();
        c.doAction();
    }
}
