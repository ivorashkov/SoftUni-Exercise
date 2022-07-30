package FundamentalsBasicSyntax.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighborhood = stringListToIntegerList(scanner);

        int currentIndex = 0;
        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("love!")) {
            String[] jumpCommand = input.split("\\s+");
            int jumpLength = Integer.parseInt(jumpCommand[1]);
            currentIndex += jumpLength;

            if (currentIndex >= neighborhood.size()) {
                currentIndex = 0;
            }

            if (neighborhood.get(currentIndex) > 0) {//проверяваме дали стойността на индекса е по-голяма от нула
                neighborhood.set(currentIndex, neighborhood.get(currentIndex) - 2);//вземаме 2 от текущата стойност

                if (neighborhood.get(currentIndex) <= 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }

            input = scanner.nextLine().toLowerCase();
        }

        int failedPlaces = getFailedPlaces(neighborhood);

        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        if (failedPlaces > 0) {
            System.out.printf("Cupid has failed %d places.%n", failedPlaces);
        } else {
            System.out.println("Mission was successful.");
        }

    }

    private static int getFailedPlaces(List<Integer> neighborhood) {
        int failedPlaces = 0;//броим колко места не са имали свети валентин
        for (int num: neighborhood) {
            if (num > 0 ){
                failedPlaces++;
            }
        }
        return failedPlaces;
    }

    private static List<Integer> stringListToIntegerList(Scanner scanner) {
        List<String> numString = new ArrayList<>(Arrays.asList(scanner.nextLine().toLowerCase().split("@")));
        List<Integer> numbers = new ArrayList<>();
        numString.forEach(number -> numbers.add(Integer.parseInt(number)));
        return numbers;
    }
}
