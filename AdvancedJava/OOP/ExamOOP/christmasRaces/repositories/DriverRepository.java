package AdvancedJava.OOP.ExamOOP.christmasRaces.repositories;

import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.drivers.Driver;
import AdvancedJava.OOP.ExamOOP.christmasRaces.repositories.interfaces.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class DriverRepository implements Repository<Driver> {
    private Map<String, Driver> drivers;

    public DriverRepository() {
        this.drivers = new LinkedHashMap<>();
    }

    @Override
    public Driver getByName(String name) {
        return drivers.get(name);
    }

    @Override
    public Collection<Driver> getAll() {
        return Collections.unmodifiableCollection(drivers.values());
    }

    @Override
    public void add(Driver driver) {
        drivers.putIfAbsent(driver.getName(),driver);
    }

    @Override
    public boolean remove(Driver driver) {
        return drivers.remove(driver.getName()) != null;
    }
}
