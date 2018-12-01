package com.app.ch09;

public class RedPen extends Pen {

    public RedPen(){
        System.out.println("\tRedPen constructor");
    }

    public void doAction() {
        try {
            System.out.println("\tDoAction.Start");
            Thread.sleep(5000);
            System.out.println("\tDoAction.Finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
