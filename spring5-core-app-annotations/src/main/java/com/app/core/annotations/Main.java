package com.app.core.annotations;

public class Main {

    public static void main(String[] args) {
        MyRepository myRepository = new MyRepository();
        MyService myService = new MyService();
        myService.setMyRepository(myRepository);
        myService.doAction();

        MyRepository myRepository2 = new MyRepository(){

            @Override
            public void makeSave() {
                System.out.println("MyRepo2.makeSAVE()");
            }
        };

        myService.setMyRepository(myRepository2);
        myService.doAction();
    }
}
