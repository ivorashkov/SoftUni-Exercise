package BasicExercises;

import java.util.Scanner;

public class TrekingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsNumber = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int kilimandzharo = 0;
        int k2 = 0;
        int everest = 0;
        double total = 0;

        for (int i = 0; i < groupsNumber; i++) {
            int numberOfPeople = Integer.parseInt(scanner.nextLine());


            if (numberOfPeople <= 5) {
                total += numberOfPeople;
                musala += numberOfPeople;

            } else if (numberOfPeople <= 12) {
                total += numberOfPeople;
                monblan += numberOfPeople;
            } else if (numberOfPeople <= 25) {
                total += numberOfPeople;
                kilimandzharo += numberOfPeople;
            } else if (numberOfPeople <= 40) {
                total += numberOfPeople;
                k2 += numberOfPeople;
            } else if (numberOfPeople >= 41) {
                total += numberOfPeople;
                everest += numberOfPeople;
            }

        }
        System.out.printf("%.2f%%%n", musala / total * 100);
        System.out.printf("%.2f%%%n", monblan / total * 100);
        System.out.printf("%.2f%%%n", kilimandzharo / total * 100);
        System.out.printf("%.2f%%%n", k2 / total * 100);
        System.out.printf("%.2f%%%n", everest / total * 100);
    }
}
