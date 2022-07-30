package AdvancedJava.OOP.Encapsulation.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if ("meat".equalsIgnoreCase(toppingType) || "veggies".equalsIgnoreCase(toppingType) ||
                "cheese".equalsIgnoreCase(toppingType) || "sauce".equalsIgnoreCase(toppingType)) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return (2 * weight) * getBaseCaloriesPerToppingPerGram();
    }

    private double getBaseCaloriesPerToppingPerGram() {
        if ("meat".equalsIgnoreCase(this.toppingType)) {
            return 1.2;
        } else if ("veggies".equalsIgnoreCase(this.toppingType)) {
            return  0.8;
        } else if ("cheese".equalsIgnoreCase(this.toppingType)) {
            return  1.1;
        } else if ("sauce".equalsIgnoreCase(this.toppingType)) {
            return  0.9;
        }
        return 0.0;
    }
}
