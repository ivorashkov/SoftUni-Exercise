package AdvancedJava.OOP.ExamOOP.christmasRaces.core;


import AdvancedJava.OOP.ExamOOP.christmasRaces.common.ExceptionMessages;
import AdvancedJava.OOP.ExamOOP.christmasRaces.common.OutputMessages;
import AdvancedJava.OOP.ExamOOP.christmasRaces.core.interfaces.Controller;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.cars.Car;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.cars.MuscleCar;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.cars.SportsCar;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.drivers.Driver;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.drivers.DriverImpl;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.races.Race;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.races.RaceImpl;
import AdvancedJava.OOP.ExamOOP.christmasRaces.repositories.interfaces.Repository;

import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
/**OKAY**/
    private Repository<Driver> driverRepository;
    private Repository<Car> carRepository;
    private Repository<Race> raceRepository;

    public ControllerImpl(Repository<Driver> driverRepository, Repository<Car> carRepository, Repository<Race> raceRepository) {
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.raceRepository = raceRepository;
    }

    @Override
    public String createDriver(String driverName) {
        if (driverRepository.getByName(driverName) != null) {
            throw new IllegalArgumentException(String.format
                    (ExceptionMessages.DRIVER_EXISTS, driverName));
        }

        Driver driver = new DriverImpl(driverName);
        driverRepository.add(driver);
        return String.format(OutputMessages.DRIVER_CREATED, driverName);
    }

    @Override
    public String createCar(String type, String model, int horsePower) {

        if (carRepository.getByName(model) != null) {
            throw new IllegalArgumentException(String.format
                    (ExceptionMessages.CAR_EXISTS, model));
        }

        Car car = null;
        if ("Muscle".equals(type)) {
            car = new MuscleCar(model, horsePower);
        }

        if ("Sports".equals(type)) {
            car = new SportsCar(model, horsePower);
        }
        carRepository.add(car);
        return String.format(OutputMessages.CAR_CREATED, type + "Car", model);
    }

    @Override
    public String addCarToDriver(String driverName, String carModel) {
        Driver driver = driverRepository.getByName(driverName);
        if (driver == null) {
            throw new IllegalArgumentException(String.format
                    (ExceptionMessages.DRIVER_NOT_FOUND, driverName));
        }

        Car car = carRepository.getByName(carModel);
        if (car == null) {
            throw new IllegalArgumentException(String.format
                    (ExceptionMessages.CAR_NOT_FOUND, carModel));
        }

        driver.addCar(car);
        return String.format(OutputMessages.CAR_ADDED, driverName, carModel);
    }

    @Override
    public String addDriverToRace(String raceName, String driverName) {
        Race race = raceRepository.getByName(raceName);
        if (race == null) {
            throw new IllegalArgumentException(String.format
                    (ExceptionMessages.RACE_NOT_FOUND, raceName));
        }

        Driver driver = driverRepository.getByName(driverName);
        if (driver == null) {
            throw new IllegalArgumentException(String.format
                    (ExceptionMessages.DRIVER_NOT_FOUND, driverName));
        }

        race.addDriver(driver);
        return String.format(OutputMessages.DRIVER_ADDED, driverName, raceName);
    }

    @Override
    public String createRace(String name, int laps) {

        if (raceRepository.getByName(name) != null) {
            throw new IllegalArgumentException(String.format
                    (ExceptionMessages.RACE_EXISTS, name));
        }
        Race race = new RaceImpl(name, laps);
        raceRepository.add(race);
        return String.format(OutputMessages.RACE_CREATED, name);
    }

    @Override
    public String startRace(String raceName) {
        Race race = raceRepository.getByName(raceName);
        if (race == null) {
            throw new IllegalArgumentException(String.format
                    (ExceptionMessages.RACE_NOT_FOUND, raceName));
        }

        if (race.getDrivers().size() < 3) {
            throw new IllegalArgumentException(String.format
                    (ExceptionMessages.RACE_INVALID, raceName, 3));
        }

        List<Driver> sortedDriver = race.getDrivers().stream().
                sorted((s1, s2) -> Double.compare(s2.getCar().calculateRacePoints(race.getLaps()), s1.getCar().calculateRacePoints(race.getLaps()))).
                collect(Collectors.toList());
        raceRepository.remove(race);

        StringBuilder sb = new StringBuilder();
        sb.append(String.format(OutputMessages.DRIVER_FIRST_POSITION, sortedDriver.get(0).getName(), raceName))
                .append(System.lineSeparator())
                .append(String.format(OutputMessages.DRIVER_SECOND_POSITION, sortedDriver.get(1).getName(), raceName))
                .append(System.lineSeparator())
                .append(String.format(OutputMessages.DRIVER_THIRD_POSITION, sortedDriver.get(2).getName(), raceName));

        return sb.toString();
    }
}
