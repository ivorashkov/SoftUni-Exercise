package AdvancedJava.OOP.ExamOOP.zoo.entities.animals;

public class AquaticAnimal extends BaseAnimal{
    private final static double INITIAL_AQUATIC_ANIMAL_KG = 2.50;
    //can only live in water

    public AquaticAnimal(String name, String kind, double price) {
        super(name, kind, INITIAL_AQUATIC_ANIMAL_KG, price);
    }

    @Override
    public void eat() {
        setKg(getKg() + 7.50);
    }
}
