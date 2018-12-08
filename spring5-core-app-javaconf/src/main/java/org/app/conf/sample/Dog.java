package org.app.conf.sample;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    public void makeSound() {
        System.out.println("Dog.sound()");
    }
}
