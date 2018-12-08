package com.app.core.annotations;


import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CityProcessor {

    @Inject
    @Named("kiev")
    private City city;

    public void processCity(){
        city.printInfo();
    }
}
