package BasicExercises;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int menuChicken = Integer.parseInt(scanner.nextLine());
        int menuFish = Integer.parseInt(scanner.nextLine());
        int menuVegetairan = Integer.parseInt(scanner.nextLine());

        double chicken = menuChicken * 10.35;
        double fish = menuFish * 12.40;
        double veg = menuVegetairan * 8.15;

        double totalMenu = chicken + fish + veg;

        double desert =totalMenu * 0.20;

        double price =  totalMenu + desert + 2.50;

        System.out.println(price);


    }


}
