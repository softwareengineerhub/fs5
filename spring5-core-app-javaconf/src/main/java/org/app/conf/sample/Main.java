package org.app.conf.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig2.class);
        AnimalService animalService =ctx.getBean(AnimalService.class);
        animalService.doAction();
    }
}
