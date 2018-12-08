package org.app.conf.sample;

import org.springframework.stereotype.Component;

@Component
public class Duck implements Animal {

    public void makeSound() {
        System.out.println("Duck.sound()");
    }
}
