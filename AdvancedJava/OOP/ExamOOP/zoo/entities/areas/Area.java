package AdvancedJava.OOP.ExamOOP.zoo.entities.areas;

import AdvancedJava.OOP.ExamOOP.zoo.entities.animals.Animal;
import AdvancedJava.OOP.ExamOOP.zoo.entities.foods.Food;

import java.util.Collection;

public interface Area {
    String getName();

    Collection<Animal> getAnimals();

    Collection<Food> getFoods();

    int sumCalories();

    void addAnimal(Animal animal);

    void removeAnimal(Animal animal);

    void addFood(Food food);

    void feed();

    String getInfo();
}
