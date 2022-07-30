package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] asNums = input.split("\\s+");

        int sumEven=0;
        for (int i = 0; i < asNums.length; i++) {
            int currentNum = Integer.parseInt(asNums[i]);

            if (currentNum % 2 == 0 ){
                sumEven += currentNum;
            }
        }
        System.out.println(sumEven);

    }
}
