package com.app.core.ch01.nospring;

public interface PersonService {

    public void make(Person p);

    public Person getById(int id);

    public Person updateById(int idFilter, String nameFilter, Person candidat);

    public void removeDataById(int idFilter);

    public int amount();
}
