package com.app.core.ch01.nospring;

public class PersonDefaultServiceImpl implements PersonService {
    private MyRepository myRepository;

    public PersonDefaultServiceImpl(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void make(Person p) {
        System.out.println("make started");
        long start = System.currentTimeMillis();
        myRepository.create(p);
        System.out.println("make finish: "+(System.currentTimeMillis()-start));
    }

    public Person getById(int id) {
        long start = System.currentTimeMillis();
        try {
            System.out.println("getById started");
            return myRepository.readById(id);
        }finally {
            System.out.println("getById finish: " + (System.currentTimeMillis() - start));
        }
    }

    public Person updateById(int idFilter, String nameFilter, Person candidat) {

        System.out.println("updateById started");
        long start = System.currentTimeMillis();
        Person oldValue=myRepository.update(idFilter, nameFilter, candidat);
        System.out.println("updateById finish: "+(System.currentTimeMillis()-start));
        return oldValue;
    }

    public void removeDataById(int idFilter) {
        System.out.println("removeDataById started");
        long start = System.currentTimeMillis();
        myRepository.removeById(idFilter);
        System.out.println("removeDataById finish: "+(System.currentTimeMillis()-start));
    }

    public int amount() {
        System.out.println("amount started");
        long start = System.currentTimeMillis();
        int res=myRepository.count();
        System.out.println("amount finish: "+(System.currentTimeMillis()-start));
        return res;
    }
}
