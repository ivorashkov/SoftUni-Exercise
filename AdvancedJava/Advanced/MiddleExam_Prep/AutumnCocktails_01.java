package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.*;
import java.util.stream.Collectors;

public class AutumnCocktails_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //queue
        ArrayDeque<Integer> ingredients = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        //stack
        ArrayDeque<Integer> freshness = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(freshness::push);


        Map<String, Integer> listOfCocktails = new LinkedHashMap<>();
        listOfCocktails.put("Apple Hinny", 0);
        listOfCocktails.put("High Fashion", 0);
        listOfCocktails.put("Pear Sour", 0);
        listOfCocktails.put("The Harvest", 0);
        while (!ingredients.isEmpty() && !freshness.isEmpty()) {
            int ingredient = ingredients.peek();
            int fresh = freshness.peek();

            if (ingredient == 0) {
                ingredients.pop();
                continue;
            }

            if (ingredient * fresh == 150) {
                String name = "Pear Sour";
                cocktail(listOfCocktails, name);
                ingredients.pop();
                freshness.poll();
            } else if (ingredient * fresh == 250) {
                String name = "The Harvest";
                cocktail(listOfCocktails, name);
                ingredients.pop();
                freshness.poll();
            } else if (ingredient * fresh == 300) {
                String name = "Apple Hinny";
                cocktail(listOfCocktails, name);
                ingredients.pop();
                freshness.poll();
            } else if (ingredient * fresh == 400) {
                String name = "High Fashion";
                cocktail(listOfCocktails, name);
                ingredients.pop();
                freshness.poll();
            } else {
                freshness.poll();
                ingredients.offer(ingredients.pop() + 5);
            }
        }

        boolean moreThanZero = listOfCocktails.entrySet().stream().allMatch(c -> c.getValue() > 0);

        String msg = moreThanZero ? "It's party time! The cocktails are ready!" :
                "What a pity! You didn't manage to prepare all cocktails.";

        System.out.println(msg);

        if (ingredients.size() > 0) {
            Integer sum = ingredients.stream().reduce(0, Integer::sum);
            System.out.println("Ingredients left: " + sum);
        }

        listOfCocktails.entrySet().stream().filter(e -> e.getValue() > 0)
                .forEach(e -> System.out.println(" # " + e.getKey() + " --> " + e.getValue()));

    }

    private static void cocktail(Map<String, Integer> listOfCocktails, String name) {
        Integer isExisting = listOfCocktails.get(name);
        if (isExisting != null) {
            listOfCocktails.put(name, isExisting + 1);
        } else {
            listOfCocktails.put(name, 1);
        }
    }
}
