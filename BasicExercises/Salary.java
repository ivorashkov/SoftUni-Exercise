package BasicExercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        double penalty = 0;



        for (int i = 0; i < openTabs; i++) {
            String nameOfTab = scanner.nextLine();

            switch (nameOfTab) {
                case "Facebook":
                    penalty += 150;
                    break;
                case "Instagram":
                    penalty += 100;
                    break;
                case "Reddit":
                    penalty += 50;
                    break;

            }


        }
        if (penalty >= salary) {
            System.out.printf("You have lost your salary.");
        } else {

            System.out.printf("%.0f", salary - penalty);
        }
    }
}