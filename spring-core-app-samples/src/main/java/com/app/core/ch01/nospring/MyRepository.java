package com.app.core.ch01.nospring;

public interface MyRepository {

    public void create(Person p);

    public Person readById(int id);

    public Person update(int idFilter, String nameFilter, Person candidat);

    public void removeById(int idFilter);

    public int count();
}
