package AdvancedJava.OOP.ExamOOP.christmasRaces.repositories;

import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.cars.Car;
import AdvancedJava.OOP.ExamOOP.christmasRaces.repositories.interfaces.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class CarRepository implements Repository<Car> {
    private Map<String, Car> cars;

    public CarRepository() {
       this.cars = new LinkedHashMap<>();
    }

    @Override
    public Car getByName(String name) {
        return cars.get(name);
    }

    @Override
    public Collection<Car> getAll() {
        return Collections.unmodifiableCollection(cars.values());
    }

    @Override
    public void add(Car car) {
        cars.putIfAbsent(car.getModel(), car);
    }

    @Override
    public boolean remove(Car car) {
        return cars.remove(car.getModel()) != null;
    }
}
