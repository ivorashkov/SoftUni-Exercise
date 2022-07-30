package BasicExercises;

import java.util.Scanner;

public class TenisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournament = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        double winRate = 0;
        int earnedPoints = 0;

        for (int i = 0; i < numberOfTournament; i++) {
            String result = scanner.nextLine();

            if (result.equals("W")) {
                winRate += 1;
                points += 2000;
                earnedPoints += 2000;
            } else if (result.equals("F")) {
                points += 1200;
                earnedPoints += 1200;

            } else if (result.equals("SF")) {
                points += 720;
                earnedPoints += 720;

            }

        }
        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %d%n", earnedPoints / numberOfTournament);
        System.out.printf("%.2f%%", winRate / numberOfTournament * 100);

    }
}
