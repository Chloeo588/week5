package ru.fedotova.week5.model;

public class Penguin extends AbstractAnimal {
    @Override
    void name(){
        System.out.println("Я Пингвин");
    }
    @Override
    void type() {
        super.type();
        super.bird();
    }

    @Override
    void fly(){
        System.out.println("Я не умею летать, зато умею плавать");
    }
    @Override
    void home(){
        super.home();
    }

}
