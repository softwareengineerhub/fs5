package com.app.core.ch01.nospring;

public class PersonServiceDenisImpl implements PersonService {
    private MyRepository myRepository;

    public MyRepository getMyRepository() {
        return myRepository;
    }

    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void make(Person p) {

    }

    public Person getById(int id) {
        return null;
    }

    public Person updateById(int idFilter, String nameFilter, Person candidat) {
        return null;
    }

    public void removeDataById(int idFilter) {

    }

    public int amount() {
        return 0;
    }
}
