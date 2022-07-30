package AdvancedJava.OOP.Encapsulation.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if ("wholegrain".equalsIgnoreCase(flourType) || "white".equalsIgnoreCase(flourType)) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if ("crispy".equalsIgnoreCase(bakingTechnique)
                || "chewy".equalsIgnoreCase(bakingTechnique)
                || "homemade".equalsIgnoreCase(bakingTechnique)) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double calculateCalories() {
        return ((2 * weight) * doughCalories()) * getbakingTechniqueCalories();
    }

    private double getbakingTechniqueCalories(){
        if ("crispy".equalsIgnoreCase(bakingTechnique)){
            return 0.9;
        }else if ("chewy".equalsIgnoreCase(bakingTechnique)){
            return 1.1;
        }else if ("homemade".equalsIgnoreCase(bakingTechnique)){
            return 1.0;
        }
        return 0;
    }

    private double doughCalories(){
        if ("white".equalsIgnoreCase(flourType)){
            return 1.5;
        }else if ("wholegrain".equalsIgnoreCase(flourType)){
            return 1.0;
        }
        return 0;
    }


}
