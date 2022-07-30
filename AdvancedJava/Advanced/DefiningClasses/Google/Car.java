package AdvancedJava.Advanced.DefiningClasses.Google;

public class Car {
    private String model;
    private int carSpeed;

    public Car(String model, int carSpeed) {
        this.model = model;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return this.model + " " + this.carSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }
}

