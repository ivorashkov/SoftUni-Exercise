package AdvancedJava.OOP.InterfacesAndAbstraction.FoodShortage;

public abstract class PersonImpl implements Person, Buyer, Identifiable {

    private String name;
    private int age;

    protected PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** Person **/
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    /** Buyer **/
    /** Identifiable **/
}
