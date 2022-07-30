package AdvancedJava.OOP.ExamOOP.christmasRaces.entities.cars;

import AdvancedJava.OOP.ExamOOP.christmasRaces.common.ExceptionMessages;

public class MuscleCar extends BaseCar{
    private final static double DEFAULT_CUBIC_CENTIMETERS = 5000;
    private final static int MIN_HORSE_POWER = 400;
    private final static int MAX_HORSE_POWER = 600;

    public MuscleCar(String model, int horsePower) {
        super(model, horsePower, DEFAULT_CUBIC_CENTIMETERS);
    }


    @Override
    protected void checkHorsePower(int horsePower) {
        //could work with protected setHorsepower and Override
        if (horsePower < MIN_HORSE_POWER || horsePower > MAX_HORSE_POWER){
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_HORSE_POWER, horsePower));
        }
    }

}
