package com.app.ch04;

public class Producer {
    Consumer consumer = new Consumer();


    public void doProduce(){
        consumer.doAction();
    }

    //@Override
    public void doAction(){

    }


}
