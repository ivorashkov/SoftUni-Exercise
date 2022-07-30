package AdvancedJava.OOP.ExamOOP.christmasRaces.entities.drivers;

import AdvancedJava.OOP.ExamOOP.christmasRaces.common.ExceptionMessages;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.cars.Car;

public class DriverImpl implements Driver {
    private String name;
    private Car car;
    private int numberOfWins;
    private boolean canParticipate; //default should be false

    public DriverImpl(String name) {
        this.setName(name);
        this.canParticipate = false;
    }


    private void setName(String name) {
        if (name == null || name.trim().length() < 5) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_NAME, name, 5));
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Car getCar() {
        return this.car;
    }

    @Override
    public int getNumberOfWins() {
        return this.numberOfWins;
    }

    @Override
    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.CAR_INVALID));
        }
        this.car = car;
    }

    @Override
    public void winRace() {
        this.numberOfWins ++;
    }

    @Override
    public boolean getCanParticipate() {
        return car != null;
    }
}
