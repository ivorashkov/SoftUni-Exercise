package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repetitions = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[repetitions];
        for (int i = 0; i < repetitions; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            numbers[i] = currentNum;

        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }


    }
}
