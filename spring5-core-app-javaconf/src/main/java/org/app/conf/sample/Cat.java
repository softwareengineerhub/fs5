package org.app.conf.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Cat implements Animal {

    public void makeSound() {
        System.out.println("Cat.sound()");
    }
}
