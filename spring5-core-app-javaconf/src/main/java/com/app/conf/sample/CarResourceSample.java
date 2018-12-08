package com.app.conf.sample;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CarResourceSample {

    @Resource
    private Car car;

    public void printCarResource(){
        System.out.println("printCarResource.car="+car);
    }

}
