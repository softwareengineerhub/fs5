package com.app.ch08;

public class Main {

    public static void main(String[] args) {
        Computer c = new Computer("C1");
        //c.name="C1";
        c.price=1000;
        c.process();

        AppleComputer ac = new AppleComputer("ac1");
        //ac.name="ac1";
        ac.price=2000;
        ac.process();
    }
}
