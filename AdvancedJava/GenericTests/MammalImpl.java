package AdvancedJava.GenericTests;

public abstract class MammalImpl implements Mammal{
    protected String name;
    protected int age;
    protected double weight;

    public MammalImpl(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void breath() {
        System.out.println("breathing");
    }

    @Override
    public String sleep() {
        return "Sleeping..";
    }
}
