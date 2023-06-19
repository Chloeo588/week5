package ru.fedotova.week5.model;

public class AnimalDescription{
    public void name(AbstractAnimal abstractAnimal){
        abstractAnimal.name();
    }
    public void type(AbstractAnimal abstractAnimal){
        abstractAnimal.type();
    }
    public void fly(AbstractAnimal abstractAnimal){
        abstractAnimal.fly();
    }
    public void home(AbstractAnimal abstractAnimal){
        abstractAnimal.home();
    }

}
