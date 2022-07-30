package AdvancedJava.Advanced.DefiningClasses.CarSalesman;

public class Car {
    private String model;
    public Engine engine;
    private int weight = 0;
    private String color = "n/a";

    public Car(String model, Engine engine, int weight, String color) {
        this(model,engine,weight);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this(model,engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
       this(model,engine);
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return  String.format(model + ":%n" +
                engine.getModel() + ":%n" +
                "Power: " + engine.getPower() +
                "%nDisplacement: " + (engine.getDisplacement()==0 ? "n/a" : engine.getDisplacement()) +
                "%nEfficiency: " + engine.getEfficiency() +
                "%nWeight: " + (weight==0 ? "n/a" : weight) +
                "%nColor: " + color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

