package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

//        String[] numbersAsString = input.split("\\s+");
//
//        int[] numbers = new int[numbersAsString.length];
//
//        for (int index = 0; index < numbersAsString.length; index++) {
//            numbers[index] = Integer.parseInt(numbersAsString[index]);
//        }
//
//        for (int initialNumber = 0; initialNumber < numbers.length; initialNumber++) {
//            boolean isBigger = true;
//
//            for (int rightNumbers = initialNumber + 1; rightNumbers < numbers.length; rightNumbers++) {
//
//                if (numbers[initialNumber] <= numbers[rightNumbers]) {
//                    isBigger = false;
//                    break;
//                }
//
//            }
//
//            if (isBigger) {
//                System.out.print(numbers[initialNumber] + " ");
//            }
//
//        }

        String[] numbersAsString = input.split("\\s+");

        int[] numbers = new int[numbersAsString.length];

        for (int index = 0; index < numbersAsString.length; index++) {
            numbers[index] = Integer.parseInt(numbersAsString[index]);
        }

        int maxNum = numbers[numbers.length - 1];
        String output = maxNum + " ";
        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] > maxNum) {
                output = numbers[i] + " " + output;
                maxNum = numbers[i];
            }
        }
        System.out.println(output);


    }
}
