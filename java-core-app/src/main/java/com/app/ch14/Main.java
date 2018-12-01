package com.app.ch14;

public class Main {

    public static void main(String[] args) {
        Fish fish = getFish(0);
        fish.doAction();
        try {
            fish.doAction2();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static Fish getFish(int type){
        switch(type){
            case 0: return new Fish();
        }
        return null;
    }

}
