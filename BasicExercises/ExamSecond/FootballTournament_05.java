package BasicExercises.ExamSecond;

import java.util.Scanner;

public class FootballTournament_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w = 0;
        double d = 0;
        double l = 0;
        double totalPoints = 0;

        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        if (games <= 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
        } else {

            for (int i = 0; i < games; i++) {
                String input = scanner.nextLine();

                if (input.equals("W")) {
                    totalPoints += 3;
                    w++;

                } else if (input.equals("D")) {
                    totalPoints += 1;
                    d++;

                } else if (input.equals("L")) {
                    l++;

                }
            }

            System.out.printf("%s has won %.0f points during this season.%n", name, totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %.0f%n## D: %.0f%n## L: %.0f%n", w, d, l);
            System.out.printf("Win rate: %.2f%%", ((w * 1.00) / games) * 100);
        }
    }
}
