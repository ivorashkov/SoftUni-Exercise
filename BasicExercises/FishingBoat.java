package BasicExercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double rent = 0;
        double price = 0;

        if (season.equals("Spring")) {
            rent = 3000;
            if (count <= 6) {
                price = rent - rent * 0.10;

            } else if (count > 7 && count <= 11) {
                price = rent - rent * 0.15;

            } else if (count >= 12) {
                price = rent - rent * 0.25;

            }


        } else if (season.equals("Summer")) {
            rent = 4200;
            if (count <= 6) {
                price = rent - rent * 0.10;

            } else if (count >= 7 && count <= 11) {
                price = rent - rent * 0.15;

            } else if (count >= 12) {
                price = rent - rent * 0.25;

            }

        } else if (season.equals("Autumn")) {
            rent = 4200;
            if (count <= 6) {
                price = rent - rent * 0.10;

            } else if (count >= 7 && count <= 11) {
                price = rent - rent * 0.15;

            } else if (count >= 12) {
                price = rent - rent * 0.25;

            }

        } else if (season.equals("Winter")) {
            rent = 2600;
            if (count <= 6) {
                price = rent - rent * 0.10;

            } else if (count >= 7 && count <= 11) {
                price = rent - rent * 0.15;

            } else if (count >= 12) {
                price = rent - rent * 0.25;

            }

        }

        if (season.equals("Spring") || season.equals("Summer") || season.equals("Winter")){
            if (count % 2 == 0){
                price = price - price * 0.05;
            }
        }
            if (budget >= price){
                System.out.printf("Yes! You have %.2f leva left.",Math.abs(budget - price));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(price - budget));
        }


    }
}

