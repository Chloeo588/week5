package ru.fedotova.week5.model;

public abstract class AbstractAnimal {
    abstract void name();
    void type(){
        System.out.println("Я животное");
    }
    void bird(){
        System.out.println("Я птица");
    }
    void fly(){
        System.out.println("Я умею летать");
    }
    void home(){
        System.out.println("Я живу у воды");
    }
}
