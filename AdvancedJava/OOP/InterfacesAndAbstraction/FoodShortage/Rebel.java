package AdvancedJava.OOP.InterfacesAndAbstraction.FoodShortage;

public class Rebel extends PersonImpl {
    private String group;
    private int food;

    public Rebel(String name, int age,String group) {
        super(name, age);
        this.group = group;
        this.food = 0;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }

    @Override
    public int getFood() {
        return food;
    }


    /** should not exist **/
    @Override
    public String getId() {
        return "";
    }
}
