package com.app.ch10;

public class PlayerProcessor {

    public void process(Player... players){
        //players.length
        int sum = 0;
        for(Player player:players){
            sum+=player.teamNumber();
        }
        System.out.println("total sum = "+sum);
    }
}
