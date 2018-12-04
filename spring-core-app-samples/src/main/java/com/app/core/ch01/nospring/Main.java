package com.app.core.ch01.nospring;

public class Main {

    public static void main(String[] args) {
        MyRepository repository = getRepository(0);
        PersonService service = new PersonDefaultServiceImpl(repository);
        int amount= service.amount();
        System.out.println("amount="+amount);
        Person p = new Person();
        p.setName("P1");
        p.setAge(1);
        service.make(p);
        Person p1=service.getById(0);
        System.out.println("p1="+p1);
        amount= service.amount();
        System.out.println("amount="+amount);
    }

    public static MyRepository getRepository(int type){
        switch(type){
            case 0: return new MyDefultRepositoryImpl();
            default: throw new RuntimeException("Incorrect type="+type);
        }
    }
}
