package com.app.ch10;

public class Main {

    public static void main(String[] args) {
        Ronaldinho ronaldinho = new Ronaldinho();
        Shevchenko shevchenko = new Shevchenko();
        Ronaldo ronaldo = new Ronaldo();

        PlayerProcessor playerProcessor = new PlayerProcessor();
        playerProcessor.process(ronaldinho);
        playerProcessor.process(shevchenko);
        playerProcessor.process(ronaldo);
        playerProcessor.process();
        playerProcessor.process(ronaldinho, shevchenko, ronaldo);

        System.out.println("---------------------");
        CoachProcessor coachProcessor = new CoachProcessor();
        //coachProcessor.process(ronaldinho);
        coachProcessor.process(shevchenko, shevchenko);
        coachProcessor.process(ronaldo, shevchenko);

    }
}
