package BasicExercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double totalMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double resistance = Math.floor(totalMeters / 15) * 12.5;
        double ivanTime = totalMeters * secondsPerMeter + resistance;

        if (currentRecord > ivanTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivanTime - currentRecord);

        }

    }
}
