package com.app.service;

import com.app.model.Person;

public interface PersonService {

    public void create(Person p);

    public Person get(int id);

    public Person update(int id, Person candidateValue);

    public Person delete(int id);




}
