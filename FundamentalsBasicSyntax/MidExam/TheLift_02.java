package FundamentalsBasicSyntax.MidExam;

import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //people count
        int peopleCount = Integer.parseInt(scanner.nextLine());

        //train space
        String[] wagonsAsString = scanner.nextLine().split("\\s+");
        int[] wagonNums = new int[wagonsAsString.length];

        for (int i = 0; i < wagonNums.length; i++) {
            wagonNums[i] = Integer.parseInt(wagonsAsString[i]);
        }

        boolean isEmpty = false;
        for (int i = 0; i < wagonNums.length; i++) {
            if (wagonNums[i] < 4) {
                for (int j = wagonNums[i]; j < 4; j++) {
                    if (wagonNums[i] < 4 && peopleCount > 0) {
                        wagonNums[i] = wagonNums[i] + 1;
                        peopleCount--;
                        isEmpty = true;

                    } else {
                        isEmpty = false;
                    }
                }
            }
        }

        if (peopleCount != 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleCount);

        } else if (peopleCount == 0 && isEmpty == false) {
            System.out.println("The lift has empty spots!");
        } else if (peopleCount == 0 && isEmpty == true) {

        }
        for (int num : wagonNums) {
            System.out.print(num + " ");

        }
    }
}
