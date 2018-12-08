package com.app.core.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class Ukraine implements Country {

    public void showInfo() {
        System.out.println("Ukraine");
    }
}
