package AdvancedJava.Advanced.ActualMidExam;

import java.util.*;

public class ChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Queue -> peek, pop(); the first milk value
        ArrayDeque<Double> milk = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).forEach(milk::offer);


        //Stack -> peek, poll  last cacao powder value.
        ArrayDeque<Double> cacao = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).forEach(cacao::push);


        Map<String, Integer> chockMap = new TreeMap<>();
        chockMap.put("Baking Chocolate", 0);
        chockMap.put("Dark Chocolate", 0);
        chockMap.put("Milk Chocolate", 0);
        int chocolateCOunt = 0;
        boolean madeEverything = false;
        while (!milk.isEmpty() && !cacao.isEmpty()) {
            double currentCacao = cacao.poll();
            double currentMilk = milk.pop();
            double cacaoPercentage = (currentCacao / (currentCacao + currentMilk)) * 100;

            //Your task is considered done if you make at least three chocolates - one of each type.
            if (chocolateCOunt >= 3) {
                madeEverything = true;
            }

            if (cacaoPercentage == 30) {
                String name = "Milk Chocolate";
                Integer current = chockMap.get(name);
                if (current == 0) {
                    chocolateCOunt++;
                }
                chockMap.put(name, current + 1);
            } else if (cacaoPercentage == 50) {
                String name = "Dark Chocolate";
                Integer current = chockMap.get(name);
                if (current == 0) {
                    chocolateCOunt++;
                }
                chockMap.put(name, current + 1);
            } else if (cacaoPercentage == 100) {
                String name = "Baking Chocolate";
                Integer current = chockMap.get(name);
                if (current == 0) {
                    chocolateCOunt++;
                }
                chockMap.put(name, current + 1);
            } else {
                double newValue = currentMilk += 10;
                milk.offer(newValue);
            }
        }

        if (madeEverything){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }else{
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        chockMap.entrySet().stream().filter(e -> e.getValue() > 0)
                .forEach(e -> System.out.println(" # " + e.getKey() + " --> " + e.getValue()));


    }
}
