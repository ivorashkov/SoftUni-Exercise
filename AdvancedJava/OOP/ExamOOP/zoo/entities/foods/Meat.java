package AdvancedJava.OOP.ExamOOP.zoo.entities.foods;

public class Meat extends BaseFood{
    private final static int CALORIES_FOR_MEAT = 70;
    private final static double PRICE_FOR_MEAT = 10.0;

    public Meat() {
        super(CALORIES_FOR_MEAT, PRICE_FOR_MEAT);
    }


}
