package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int inputTwo = Math.abs(input);
        int result = getMultipleOfEvensAndOdds(inputTwo);
        System.out.println(result);


    }

    static int getMultipleOfEvensAndOdds(int input) {
        int evenSum = getSumOfEvenDigits(input);
        int oddSum = getSumOfOddDigits(input);

        return evenSum * oddSum;

    }

    static int getSumOfEvenDigits(int input) {
        int evenSum = 0;
        while (input > 0) {
            int lastNum = input % 10;
            input /= 10;
            if (lastNum % 2 == 0) {
                evenSum += lastNum;
            }

        }
        return evenSum;
    }

    static int getSumOfOddDigits(int input) {
        int oddSum = 0;

        while (input > 0) {
            int lastNum = input % 10;
            input /= 10;
            if (lastNum % 2 == 1) {
                oddSum += lastNum;
            }
        }
        return oddSum;
    }
}