package com.app.ch10;

public class CoachProcessor {

    public void process(Coach... coaches){
        //players.length
        String teams = "";
        for(Coach coache:coaches){
            teams+=coache.teamName()+"; ";
        }
        System.out.println("teams = "+teams);
    }
}
