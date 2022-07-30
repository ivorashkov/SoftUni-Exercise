package BasicExercises.NestedLoops;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String destination = input;//Destination -> Greece
            double budget = Double.parseDouble(scanner.nextLine());

            double sum = 0;
            while (sum < budget) {

                //new money income
                double amount = Double.parseDouble(scanner.nextLine());

                sum = sum + amount;
            }

            System.out.printf("Going to %s!%n", destination);

            input = scanner.nextLine();
        }
    }
}
