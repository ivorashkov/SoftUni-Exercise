package AdvancedJava.OOP.ExamOOP.christmasRaces.entities.drivers;

import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.cars.Car;

public interface Driver {
    String getName();

    Car getCar();

    int getNumberOfWins();

    void addCar(Car car);

    void winRace();

    boolean getCanParticipate();
}
