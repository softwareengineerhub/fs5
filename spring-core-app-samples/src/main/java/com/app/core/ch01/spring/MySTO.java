package com.app.core.ch01.spring;

public class MySTO {

    private String cuurentCarName;

    public String getCuurentCarName() {
        return cuurentCarName;
    }

    public void setCuurentCarName(String cuurentCarName) {
        this.cuurentCarName = cuurentCarName;
    }

    @Override
    public String toString() {
        return "MySTO{" +
                "cuurentCarName='" + cuurentCarName + '\'' +
                '}';
    }
}
