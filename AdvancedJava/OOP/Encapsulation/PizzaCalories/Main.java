package AdvancedJava.OOP.Encapsulation.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Pizza pizza = getPizza(scanner);

            Dough dough = getDough(scanner);
            pizza.setDough(dough);

            String command = scanner.nextLine();
            while (!"end".equalsIgnoreCase(command)) {
                String[] tokens = command.split("\\s+");

                String type = tokens[0];

                if ("topping".equalsIgnoreCase(type)) {
                    String toppingType = tokens[1];
                    int weightInGrams = Integer.parseInt(tokens[2]);

                    Topping topping = new Topping(toppingType, weightInGrams);
                    pizza.addTopping(topping);
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%n", pizza.getName(), pizza.getOverallCalories());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Dough getDough(Scanner scanner) {
        String[] doughInfo = scanner.nextLine().split("\\s+");
        Dough dough = null;
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        int weightInGrams = Integer.parseInt(doughInfo[3]);

        dough = new Dough(flourType, bakingTechnique, weightInGrams);

        return dough;
    }

    private static Pizza getPizza(Scanner scanner) {
        Pizza pizza = null;
        String[] pizzaInfo = scanner.nextLine().split("\\s+");
        String name = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);

        pizza = new Pizza(name, numberOfToppings);
        return pizza;
    }
}
