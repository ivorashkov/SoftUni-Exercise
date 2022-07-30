package AdvancedJava.OOP.ExamOOP.christmasRaces.entities.cars;

import AdvancedJava.OOP.ExamOOP.christmasRaces.common.ExceptionMessages;

public class SportsCar extends BaseCar{
    private final static double DEFAULT_CUBIC_CENTIMETERS = 3000;
    private final static int MIN_HORSE_POWER = 250;
    private final static int MAX_HORSE_POWER = 450;


    public SportsCar(String model, int horsePower) {
        super(model, horsePower, DEFAULT_CUBIC_CENTIMETERS);
    }

    @Override
    protected void checkHorsePower(int horsePower) {
        if (horsePower < MIN_HORSE_POWER || horsePower > MAX_HORSE_POWER){
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_HORSE_POWER, horsePower));
        }
    }
}
