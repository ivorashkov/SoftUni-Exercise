package AdvancedJava.OOP.Polymorphism.Animals;

public class Cat extends Animal{

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s MEEOW", super.name, super.favouriteFood);
    }
}