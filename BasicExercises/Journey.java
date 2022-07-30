package BasicExercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String where = "";

        if (season.equals("summer")) {
            if (budget <= 100) {
                destination = "Bulgaria";
                where = "Camp";
                budget = budget * 0.30;

            } else if (budget <= 1000) {
                destination = "Balkans";
                where = "Camp";
                budget = budget * 0.40;
            } else if (budget > 1000) {
                destination = "Europe";
                where = "Hotel";
                budget = budget * 0.90;
            }

        } else if (season.equals("winter")) {
            if (budget <= 100) {
                where = "Hotel";
                destination = "Bulgaria";
                budget = budget * 0.70;

            } else if (budget <= 1000) {
                destination = "Balkans";
                where = "Hotel";
                budget = budget * 0.80;
            } else if (budget > 1000) {
                destination = "Europe";
                where = "Hotel";
                budget = budget * 0.90;
            }

        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", where, budget);

    }
}
