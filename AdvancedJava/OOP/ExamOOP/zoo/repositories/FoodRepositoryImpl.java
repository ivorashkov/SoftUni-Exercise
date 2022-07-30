package AdvancedJava.OOP.ExamOOP.zoo.repositories;

import AdvancedJava.OOP.ExamOOP.zoo.entities.foods.Food;

import java.util.ArrayList;
import java.util.Collection;

public class FoodRepositoryImpl implements FoodRepository{
    private Collection<Food> foods;

    public FoodRepositoryImpl() {
        this.foods = new ArrayList<>();
    }

    public void add(Food food){
        this.foods.add(food);
    }

    public boolean remove(Food food){
        return foods.remove(food);
    }

    public Food findByType(String type){
        return foods.stream().filter(s -> s.getClass().getSimpleName().equals(type)).findFirst().orElse(null);
    }
}
