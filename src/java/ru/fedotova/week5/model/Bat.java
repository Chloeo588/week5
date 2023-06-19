package ru.fedotova.week5.model;

public class Bat extends AbstractAnimal{
    @Override
    void name(){
        System.out.println("Я Летучая мышь");
    }

    @Override
    void type() {
        super.type();
        System.out.println("Хоть я и летаю, но я не птица, я - млекопитающее");
    }
    @Override
    void fly(){
        super.fly();
    };
    @Override
    void home(){
        System.out.println("Я живу на дереве");
    }
}
