package org.app.conf.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class AnimalService {

    //@Autowired
    //@Inject
    @Resource(name="cat")
    private Animal dog;

    public void doAction(){
        dog.makeSound();
    }


}
