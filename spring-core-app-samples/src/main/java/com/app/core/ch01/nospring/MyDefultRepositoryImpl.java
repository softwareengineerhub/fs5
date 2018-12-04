package com.app.core.ch01.nospring;

import java.util.ArrayList;
import java.util.List;

public class MyDefultRepositoryImpl implements MyRepository {
    private List<Person> data;

    public MyDefultRepositoryImpl() {
        this.data = new ArrayList<Person>();
    }

    public void create(Person p) {
        data.add(p);
    }

    public Person readById(int id) {
        return data.get(id);
    }

    public Person update(int idFilter, String nameFilter, Person candidat) {
        return data.set(idFilter, candidat);
    }

    public void removeById(int idFilter) {
        data.remove(idFilter);
    }

    public int count() {
        return data.size();
    }
}
