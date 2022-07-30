package AdvancedJava.OOP.ExamOOP.zoo.entities.animals;

public class TerrestrialAnimal extends BaseAnimal{
    private final static double INITIAL_TERRESTRIAL_ANIMAL_KG = 5.50;
    //can only live in LandArea

    public TerrestrialAnimal(String name, String kind, double price) {
        super(name, kind, INITIAL_TERRESTRIAL_ANIMAL_KG, price);
    }

    @Override
    public void eat() {
        setKg(getKg() + 5.70);
    }

}
