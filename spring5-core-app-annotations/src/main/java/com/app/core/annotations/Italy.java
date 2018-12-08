package com.app.core.annotations;

import org.springframework.stereotype.Component;

@Component
public class Italy implements Country {

    public void showInfo() {
        System.out.println("Italy");
    }
}
