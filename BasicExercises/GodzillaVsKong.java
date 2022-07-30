package BasicExercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int stageMen = Integer.parseInt(scanner.nextLine());
        double clothPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double totalClothPrice  = stageMen * clothPrice;

        double difference = 0;

        if (stageMen > 150){
            totalClothPrice = totalClothPrice - totalClothPrice * 0.10;
        }

        double totalPrice = decor + totalClothPrice;

        if (totalPrice > budget){

            difference = totalPrice - budget;

            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);

        }else if(budget >= totalPrice){

            difference = budget - totalPrice;

            if (difference != 0.00){

                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", difference);

            }

        }
    }

}
