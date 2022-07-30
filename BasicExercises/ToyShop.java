package BasicExercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double travel = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = puzzle * 2.60;
        double dollPrice = doll * 3.00;
        double bearPrice = bear * 4.10;
        double minionPrice = minion * 8.20;
        double truckPrice = truck * 2.00;

        int totalToyCount = puzzle + doll + bear + minion + truck;
        double totalToyPrice = puzzlePrice + dollPrice + bearPrice + minionPrice + truckPrice;

        double difference = 0;

        if(totalToyCount >= 50) {
            totalToyPrice = totalToyPrice - totalToyPrice * 0.25;

        }

        totalToyPrice = totalToyPrice - totalToyPrice * 0.10;

        if(travel > totalToyPrice) {

            difference = travel - totalToyPrice;
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }else{
            difference = totalToyPrice - travel;
            System.out.printf("Yes! %.2f lv left.", difference);
        }
    }

}
