package AdvancedJava.OOP.ExamOOP.zoo.entities.foods;

public class Vegetable extends BaseFood{
    private final static int CALORIES_FOR_VEGETABLE = 50;
    private final static double PRICE_FOR_VEGETABLE = 5.0;

    public Vegetable() {
        super(CALORIES_FOR_VEGETABLE, PRICE_FOR_VEGETABLE);
    }
}
