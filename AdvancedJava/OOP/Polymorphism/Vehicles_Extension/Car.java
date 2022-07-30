package AdvancedJava.OOP.Polymorphism.Vehicles_Extension;

public class Car extends Vehicle {
    private final static double SUMMER_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + SUMMER_CONSUMPTION, tankCapacity);
    }
}
