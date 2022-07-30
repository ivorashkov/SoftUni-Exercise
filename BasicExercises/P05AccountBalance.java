package BasicExercises;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //5.51 NoMoreMoney

        double sum = 0;
        while (!input.equals("NoMoreMoney")) {
            double currentAmount = Double.parseDouble(input);

            if (currentAmount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            sum = sum + currentAmount;
            System.out.printf("Increase: %.2f%n", currentAmount);

            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", sum);
    }
}
