package com.app.core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyService {

    @Autowired
    private MyRepository myRepository;

    public void doAction(){
        myRepository.makeSave();
    }

    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
