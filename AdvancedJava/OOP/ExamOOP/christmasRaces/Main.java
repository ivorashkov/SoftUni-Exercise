package AdvancedJava.OOP.ExamOOP.christmasRaces;

import AdvancedJava.OOP.ExamOOP.christmasRaces.core.ControllerImpl;
import AdvancedJava.OOP.ExamOOP.christmasRaces.core.EngineImpl;
import AdvancedJava.OOP.ExamOOP.christmasRaces.core.interfaces.Controller;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.cars.Car;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.drivers.Driver;
import AdvancedJava.OOP.ExamOOP.christmasRaces.entities.races.Race;
import AdvancedJava.OOP.ExamOOP.christmasRaces.io.ConsoleReader;
import AdvancedJava.OOP.ExamOOP.christmasRaces.io.ConsoleWriter;
import AdvancedJava.OOP.ExamOOP.christmasRaces.repositories.CarRepository;
import AdvancedJava.OOP.ExamOOP.christmasRaces.repositories.DriverRepository;
import AdvancedJava.OOP.ExamOOP.christmasRaces.repositories.RaceRepository;
import AdvancedJava.OOP.ExamOOP.christmasRaces.repositories.interfaces.Repository;

public class Main {
    public static void main(String[] args) {
        Repository<Car> carRepository = new CarRepository();
        Repository<Race> raceRepository = new RaceRepository();
        Repository<Driver> driverRepository = new DriverRepository();

       Controller controller = new ControllerImpl(driverRepository, carRepository, raceRepository);

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        EngineImpl engine = new EngineImpl(reader, writer, controller);
        engine.run();
    }
}
