package com.app.core.annotations;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class Rome implements City {

    public void printInfo() {
        System.out.println("Rome");
    }
}
