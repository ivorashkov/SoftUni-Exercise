package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] stringArray = input.split("\\s+");

        int numbersToChange = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersToChange; i++) {
            String firstNum = stringArray[0];
            for (int j = 0; j < stringArray.length - 1; j++) {

                stringArray[j] = stringArray[j + 1];

            }
            stringArray[stringArray.length - 1] = firstNum;

        }

        for (String number:stringArray) {
            System.out.print(number + " ");

        }

    }
}
