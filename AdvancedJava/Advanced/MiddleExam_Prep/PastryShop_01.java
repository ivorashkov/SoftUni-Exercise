package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.*;
import java.util.stream.Collectors;

public class PastryShop_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //queue - liquid
        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        //stack - ingredient
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);

        Map<String, Integer> listOFProducts = new LinkedHashMap<>();
        listOFProducts.put("Biscuit", 0);
        listOFProducts.put("Cake", 0);
        listOFProducts.put("Pie", 0);
        listOFProducts.put("Pastry", 0);

        while (!ingredients.isEmpty() && !liquids.isEmpty()) {
            int currentLiquid = liquids.poll();
            int currentIngredient = ingredients.pop();
            int result = currentIngredient + currentLiquid;

            if (result == 25) {
                String name = "Biscuit";
                pastry(listOFProducts, name);
            } else if (result == 50) {
                String name = "Cake";
                pastry(listOFProducts, name);
            } else if (result == 75) {
                String name = "Pastry";
                pastry(listOFProducts, name);
            } else if (result == 100) {
                String name = "Pie";
                pastry(listOFProducts, name);
            } else {
                ingredients.push(currentIngredient + 3);
            }
        }

        boolean moreThanZero = listOFProducts.entrySet().stream().allMatch(c -> c.getValue() > 0);

        String msg = moreThanZero ? "Great! You succeeded in cooking all the food!" :
                "What a pity! You didn't have enough materials to cook everything.";
        System.out.println(msg);

        //.toString().replaceAll("[\\[\\]]","");
        msg = liquids.isEmpty() ? "none" : liquids.toString().replaceAll("[\\[\\]]", "");
        System.out.println("Liquids left: " + msg);

        msg = ingredients.isEmpty() ? "none" : ingredients.toString().replaceAll("[\\[\\]]", "");
        System.out.println("Ingredients left: " + msg);

        listOFProducts.entrySet().stream()
                //.filter(e -> e.getValue() > 0)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }

    private static void pastry(Map<String, Integer> listOfPastry, String name) {
        Integer isExisting = listOfPastry.get(name);
        if (isExisting != null) {
            listOfPastry.put(name, isExisting + 1);
        } else {
            listOfPastry.put(name, 1);
        }
    }
}
