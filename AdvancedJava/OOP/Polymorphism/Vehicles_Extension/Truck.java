package AdvancedJava.OOP.Polymorphism.Vehicles_Extension;

public class Truck extends Vehicle {
    private final static double SUMMER_CONSUMPTION = 1.6;
    private final static double HOLE_IN_TANK = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + SUMMER_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        liters = liters * HOLE_IN_TANK;
        super.refuel(liters);
    }
}
