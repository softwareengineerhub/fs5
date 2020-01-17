package com.app.dao;

import com.app.model.Person;

import java.util.List;

public interface Dao {

    public List<Person> findPersonsByNameAndAge(String name, int age);

    public void save(Person person);

}
