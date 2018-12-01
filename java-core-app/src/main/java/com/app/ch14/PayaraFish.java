package com.app.ch14;

import java.io.FileNotFoundException;

public class PayaraFish extends Fish {

    /*@Override
    public void doAction()throws Exception {
        super.doAction();
    }*/

    public void doAction2() {
        try {
            super.doAction2();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
