package AdvancedJava.OOP.InterfacesAndAbstraction.FoodShortage;

public class Citizen extends PersonImpl {
    private String id;
    private String birthDate;
    private int food;


    public Citizen(String name, int age, String id, String birthDate) {
        super(name, age);
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    /** Identifiable **/
    @Override
    public String getId() {
        return this.id;
    }

    /** Buyer **/
    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

}
