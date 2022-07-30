package AdvancedJava.OOP.ExamOOP.christmasRaces.entities.races;

import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.drivers.Driver;

import java.util.Collection;

public interface Race {
    String getName();

    int getLaps();

    Collection<Driver> getDrivers();

    void addDriver(Driver driver);
}
