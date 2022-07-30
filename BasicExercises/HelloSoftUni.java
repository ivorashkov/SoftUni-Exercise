package BasicExercises;

import java.util.Scanner;

public class HelloSoftUni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogFoodPackets = Double.parseDouble(scanner.nextLine());
        double catFoodPackets = Double.parseDouble(scanner.nextLine());

        double totalCatFood = catFoodPackets * 4;
        double totalDogFood = dogFoodPackets * 2.50;

        double receipt = totalDogFood + totalCatFood;

        System.out.printf("%.2f lv.", receipt);
    }
}
