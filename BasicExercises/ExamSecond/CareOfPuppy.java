package BasicExercises.ExamSecond;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kgFood = Integer.parseInt(scanner.nextLine());
        double foodInGrams = kgFood * 1000.00;
        double foodForEat = 0;


        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            double eatingServes = Double.parseDouble(input);

            if (foodInGrams >= eatingServes) {

                foodInGrams = foodInGrams - eatingServes;


            } else{

                foodForEat = foodForEat + eatingServes;
            }


            input = scanner.nextLine();
        }

        if (foodInGrams >= foodForEat) {
            System.out.printf("Food is enough! Leftovers: %.0f grams.", Math.abs(foodInGrams));
        } else {
            System.out.printf("Food is not enough. You need %.0f grams more.", Math.abs(foodForEat - foodInGrams));
        }


    }
}
