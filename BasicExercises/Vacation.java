package BasicExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyForVacation = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int spendCount = 0;
        int dayCount = 0;


        while (availableMoney < moneyForVacation && spendCount < 5) {

            String activity = scanner.nextLine();
            double spendValue = Double.parseDouble(scanner.nextLine());
            dayCount++;


            if (activity.equals("spend")) {
                spendCount++;
                availableMoney -= spendValue;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }


            } else if (activity.equals("save")) {
                spendCount = 0;
                availableMoney += spendValue;

            }

        }

        if (spendCount == 5) {
            System.out.printf("You can't save the money.%n%d", dayCount);
        } else {
            System.out.printf("You saved the money for %d days.", dayCount);
        }

    }
}
