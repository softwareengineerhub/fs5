package com.app.ch10;

public interface Player {

    public abstract int teamNumber();

    public String teamName();

    abstract String playerName();

    String playerOccupation();

    public static final String GAME = "FOOTBALL";
    int AMOUNT_OF_PLAYERS  = 11;
}
