package ru.fedotova.week5.model;

public class Flamingo extends AbstractAnimal {
    @Override
    void name(){
        System.out.println("Я Фламинго");
    }

    @Override
    void type() {
        super.type();
        super.bird();
    }
    @Override
    void fly(){
        super.fly();
    };
    @Override
    void home(){
        super.home();
    }
}
