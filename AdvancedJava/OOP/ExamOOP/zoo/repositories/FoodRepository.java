package AdvancedJava.OOP.ExamOOP.zoo.repositories;

import AdvancedJava.OOP.ExamOOP.zoo.entities.foods.Food;

public interface FoodRepository {
    void add(Food food);

    boolean remove(Food food);

    Food findByType(String type);
}
