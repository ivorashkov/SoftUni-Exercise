package BasicExercises.ExamSecond;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalDog=0;
        double totalCat=0;
        double totalFoodEaten = 0;
        double totalBisc = 0;
        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= days; i++) {
            double dogEaten = Double.parseDouble(scanner.nextLine());
            double catEaten = Double.parseDouble(scanner.nextLine());
            totalDog += dogEaten;
            totalCat += catEaten;
            double foodPerDay = dogEaten + catEaten;
            totalFoodEaten += foodPerDay;


            if (i % 3 == 0){
                double biscuits = foodPerDay / 10;
                //totalbiisc is important due to sum of multiple 3 days
                totalBisc += biscuits;

            }

        }
        // closest number rounded - Math.abs
        System.out.printf("Total eaten biscuits: %.0fgr.%n", Math.abs(totalBisc));
        System.out.printf("%.2f%% of the food has been eaten.%n", totalFoodEaten / totalFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDog / totalFoodEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", totalCat / totalFoodEaten * 100);
    }
}
