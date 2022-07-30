package AdvancedJava.GenericTests;

public class Dog extends MammalImpl{
    String breed;

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    public String speak() {
        return "WoofWoof";
    }

    @Override
    public String toString() {
        return String.format("Dog: %s %d %f %s",name,age,weight,breed);
    }
}
