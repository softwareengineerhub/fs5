package com.app.ch02;

public class Main2 {

    public static void main(String[] args) {
        //Animal a = new Cat();
        //a.eat();
        //Dog d = new Animal();
        Animal animal = getAnimal(2);
        animal.eat();
    }

    public static Animal getAnimal(int type){
        switch(type){
            case 0: return new Animal();
            case 1: return new Dog();
            case 2: return new Cat();
            default: return new Animal();
        }
    }
}
