package AdvancedJava.GenericTests;

public class Person extends MammalImpl {
    private String workplace;

    public Person(String name, int age, double weight, String workplace) {
        super(name, age, weight);
        this.workplace = workplace;
    }

    @Override
    public String speak() {
        return "Speaking Human Language..";
    }

    @Override
    public String toString() {
        return String.format("Person: %s %d %f %s",name,age,weight,workplace);
    }
}
