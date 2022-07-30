package BasicExercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double savedMoney = 0;
        double receivedToys = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {

                double currentAge = i;
                savedMoney = savedMoney + (currentAge / 2 * 10) - 1;

            } else {
                receivedToys += 1;

            }

        }
        double priceFromToys = receivedToys * toyPrice;
        double totalMoney = priceFromToys + savedMoney;

        if (price <= totalMoney) {

            System.out.printf("Yes! %.2f", totalMoney - price);

        } else {

            System.out.printf("No! %.2f", price - totalMoney);
        }


    }
}
