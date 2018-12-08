package com.app.core.annotations;

import org.springframework.stereotype.Service;

@Service(value = "germany")
public class Germany implements Country {

    public void showInfo() {
        System.out.println("Germany");
    }
}
