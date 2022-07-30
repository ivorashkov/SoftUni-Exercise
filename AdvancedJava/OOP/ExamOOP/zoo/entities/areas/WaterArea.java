package AdvancedJava.OOP.ExamOOP.zoo.entities.areas;

import AdvancedJava.OOP.ExamOOP.zoo.entities.animals.Animal;
import AdvancedJava.OOP.ExamOOP.zoo.entities.animals.AquaticAnimal;

public class WaterArea extends BaseArea{
    private final static int TOTAL_CAPACITY = 10;

    public WaterArea(String name) {
        super(name, TOTAL_CAPACITY);
    }

   public void addAnimal(Animal animal){
        if (animal instanceof AquaticAnimal){
            super.addAnimal(animal);
        }
   }
}
