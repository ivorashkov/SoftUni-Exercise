package AdvancedJava.OOP.ExamOOP.zoo.entities.areas;

import AdvancedJava.OOP.ExamOOP.zoo.entities.animals.Animal;
import AdvancedJava.OOP.ExamOOP.zoo.entities.animals.TerrestrialAnimal;

public class LandArea extends BaseArea {
    private final static int TOTAL_CAPACITY = 25;

    public LandArea(String name) {
        super(name, TOTAL_CAPACITY);
    }

    public void addAnimal(Animal animal){
        if (animal instanceof TerrestrialAnimal){
            super.addAnimal(animal);
        }
    }
}
