package com.app.converter;

import com.app.model.Person;

public interface PersonConverter {

    public Person from(String content);

    public String to(Person person);
}
