package com.app.core.annotations;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyRepository {

   /* public MyRepository() {
        System.out.println("MyRepository.Constructor");
    }*/

    @PostConstruct
    public void init(){
        System.out.println("MyRepository.init()");
    }

    public void makeSave(){
        System.out.println("MyRepository.makeSave()");
    }
}
