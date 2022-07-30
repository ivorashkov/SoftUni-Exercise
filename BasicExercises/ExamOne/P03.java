package BasicExercises.ExamOne;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDancers = Integer.parseInt(scanner.nextLine());
        double initialPoints = Double.parseDouble(scanner.nextLine());

        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double moneyPrice = 0;

        if (place.equals("Bulgaria")) {

            moneyPrice = initialPoints * countDancers;
            if (season.equals("summer")) {

                moneyPrice = moneyPrice - moneyPrice * 0.05;
            } else {
                moneyPrice = moneyPrice - moneyPrice * 0.08;

            }

        } else {
            moneyPrice = countDancers * initialPoints;
            moneyPrice = moneyPrice + moneyPrice * 0.50;

            if (season.equals("summer")) {
                moneyPrice = moneyPrice - moneyPrice * 0.10;

            } else {
                moneyPrice = moneyPrice - moneyPrice * 0.15;

            }



        }

        double charity = moneyPrice * 0.75;
        double moneyPerPerson = (moneyPrice - charity) / countDancers;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", moneyPerPerson);


    }
}
