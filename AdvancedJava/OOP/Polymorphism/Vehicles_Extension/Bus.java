package AdvancedJava.OOP.Polymorphism.Vehicles_Extension;

public class Bus extends Vehicle {
    public final static double SUMMER_CONSUMPTION = 1.4; //with people
    //without people no air conditioning;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

}
