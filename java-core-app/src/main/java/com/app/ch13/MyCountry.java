package com.app.ch13;

public class MyCountry {
    private String name;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "MyCountry{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
