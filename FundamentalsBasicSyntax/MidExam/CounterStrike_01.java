package FundamentalsBasicSyntax.MidExam;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int wonBattles = 0;

        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("end of battle")) {
            int distance = Integer.parseInt(input);

            if (distance > energy) {
                System.out.print("Not enough energy! ");
                break;
            } else {
                energy -= distance;
                wonBattles++;

                if (wonBattles % 3 == 0) {
                    energy += wonBattles;
                }
            }
            input = scanner.nextLine().toLowerCase();
        }
        if (input.equals("end of battle")) {
            System.out.printf("Won battles: %d. Energy left: %d", wonBattles, energy);
        } else {
            System.out.printf("Game ends with %d won battles and %d energy", wonBattles, energy);
        }
    }
}
