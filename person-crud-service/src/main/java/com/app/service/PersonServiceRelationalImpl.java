package com.app.service;

import com.app.model.Person;
import com.app.repository.PersonRepository;

public class PersonServiceRelationalImpl implements PersonService {

    private PersonRepository personRepository = new PersonRepository();

    @Override
    public void create(Person p) {
        personRepository.create(p);
    }

    @Override
    public Person get(int id) {
        return personRepository.get(id);
    }

    @Override
    public Person update(int id, Person candidateValue) {
        return null;
    }

    @Override
    public Person delete(int id) {
        return null;
    }
}
