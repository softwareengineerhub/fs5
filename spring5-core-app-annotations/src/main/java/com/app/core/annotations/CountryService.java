package com.app.core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope(value = "prototype")
public class CountryService {

    @Autowired
    @Qualifier(value = "germany")
    private Country country;

    public void processCountry(){
        country.showInfo();
    }
}
