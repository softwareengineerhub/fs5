package com.app.service;

import com.app.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceDefulatImpl implements PersonService {

    private List<Person> data = new ArrayList();

    @Override
    public void create(Person p) {
        data.add(p);
    }

    @Override
    public Person get(int id) {
        return data.get(id);
    }

    @Override
    public Person update(int id, Person candidateValue) {
        return data.set(id, candidateValue);
    }

    @Override
    public Person delete(int id) {
        return data.remove(id);
    }
}
