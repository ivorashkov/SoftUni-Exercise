package AdvancedJava.OOP.ExamOOP.zoo.entities.areas;

import AdvancedJava.OOP.ExamOOP.zoo.common.ExceptionMessages;
import AdvancedJava.OOP.ExamOOP.zoo.entities.animals.Animal;
import AdvancedJava.OOP.ExamOOP.zoo.entities.foods.Food;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseArea implements Area {
    private String name;
    private int capacity;
    private Collection<Food> foods;
    private Collection<Animal> animals;

    public BaseArea(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
        this.foods = new ArrayList<>();
        this.animals = new ArrayList<>();
    }


    public int sumCalories() {
        //foods.stream().mapToInt(Food::getCalories).sum();
        return foods.stream().map(Food::getCalories).reduce(0, Integer::sum);
    }

    public void addAnimal(Animal animal) {
        if (this.capacity <= animals.size()) {
            throw new IllegalStateException(ExceptionMessages.NOT_ENOUGH_CAPACITY);
        }
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }

    public void addFood(Food food) {
        this.foods.add(food);
    }

    public void feed() {
        animals.forEach(Animal::eat);
    }

    public String getInfo() {
        return name + " (" + getClass().getSimpleName() + "):" + System.lineSeparator() +
                "Animals: " + (animals.size() == 0 ? "none" : animals.stream().map(Animal::getName).collect(Collectors.joining(" ")))
                + System.lineSeparator() +
                "Foods: " + foods.size() + System.lineSeparator() +
                "Calories: " + sumCalories();
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 1) {
            throw new NullPointerException(ExceptionMessages.AREA_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setCapacity(int capacity) {
        //the number of animals an area can have
        this.capacity = capacity;
    }

    public void setFoods(Collection<Food> foods) {
        this.foods = foods;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Collection<Food> getFoods() {
        return foods;
    }

    @Override
    public Collection<Animal> getAnimals() {
        return animals;
    }


}
