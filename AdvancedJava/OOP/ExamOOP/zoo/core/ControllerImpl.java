package AdvancedJava.OOP.ExamOOP.zoo.core;

import AdvancedJava.OOP.ExamOOP.zoo.common.ConstantMessages;
import AdvancedJava.OOP.ExamOOP.zoo.common.ExceptionMessages;
import AdvancedJava.OOP.ExamOOP.zoo.entities.animals.Animal;
import AdvancedJava.OOP.ExamOOP.zoo.entities.animals.AquaticAnimal;
import AdvancedJava.OOP.ExamOOP.zoo.entities.animals.TerrestrialAnimal;
import AdvancedJava.OOP.ExamOOP.zoo.entities.areas.Area;
import AdvancedJava.OOP.ExamOOP.zoo.entities.areas.LandArea;
import AdvancedJava.OOP.ExamOOP.zoo.entities.areas.WaterArea;
import AdvancedJava.OOP.ExamOOP.zoo.entities.foods.Food;
import AdvancedJava.OOP.ExamOOP.zoo.entities.foods.Meat;
import AdvancedJava.OOP.ExamOOP.zoo.entities.foods.Vegetable;
import AdvancedJava.OOP.ExamOOP.zoo.repositories.FoodRepository;
import AdvancedJava.OOP.ExamOOP.zoo.repositories.FoodRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
    private FoodRepository foodRepository;
    private Collection<Area> areas;

    public ControllerImpl() {
        this.foodRepository = new FoodRepositoryImpl();
        this.areas = new ArrayList<>();
    }

    @Override
    public String addArea(String areaType, String areaName) {
        Area area = null;
        if ("WaterArea".equals(areaType)) {
            area = new WaterArea(areaName);
        } else if ("LandArea".equals(areaType)) {
            area = new LandArea(areaName);
        } else {
            throw new NullPointerException(ExceptionMessages.INVALID_AREA_TYPE);
        }

        areas.add(area);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_AREA_TYPE, areaType);
    }

    @Override
    public String buyFood(String foodType) {
        Food food = null;
        if ("Vegetable".equals(foodType)) {
            food = new Vegetable();
        } else if ("Meat".equals(foodType)) {
            food = new Meat();
        } else {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_FOOD_TYPE);
        }

        foodRepository.add(food);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_FOOD_TYPE, foodType);
    }

    @Override
    public String foodForArea(String areaName, String foodType) {
        Food food = foodRepository.findByType(foodType);

        if (food == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.NO_FOOD_FOUND, foodType));
        }

        Area area = getArea(areaName);
        area.addFood(food);
        foodRepository.remove(food);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_FOOD_IN_AREA, foodType, areaName);
    }

    @Override
    public String addAnimal(String areaName, String animalType, String animalName, String kind, double price) {

        Animal animal = null;

        if ("AquaticAnimal".equals(animalType)) {
            animal = new AquaticAnimal(animalName, kind, price);
        } else if ("TerrestrialAnimal".equals(animalType)) {
            animal = new TerrestrialAnimal(animalName, kind, price);
        } else {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_ANIMAL_TYPE);
        }

        Area area = getArea(areaName);

        if ((animal instanceof AquaticAnimal && area instanceof LandArea) ||
                (animal instanceof TerrestrialAnimal && area instanceof WaterArea)) {
            return ConstantMessages.AREA_NOT_SUITABLE;
        }

        area.addAnimal(animal);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_ANIMAL_IN_AREA, animalType, areaName);
    }

    @Override
    public String feedAnimal(String areaName) {
        Area area = getArea(areaName);
        area.feed();

        return String.format(ConstantMessages.ANIMALS_FED, area.getAnimals().size());
    }

    @Override
    public String calculateKg(String areaName) {
        Area area = getArea(areaName);//вземаме региона

        double allkg = area.getAnimals().stream().mapToDouble(Animal::getKg).sum();

        return String.format(ConstantMessages.KILOGRAMS_AREA, areaName, allkg);
    }

    @Override
    public String getStatistics() {
        return areas.stream().map(Area::getInfo).collect(Collectors.joining(System.lineSeparator()));
    }

    private Area getArea(String areaName) {
        return areas.stream().filter(a -> a.getName().equals(areaName)).findFirst().orElse(null);
    }
}
