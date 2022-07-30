package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] numsAsString = input.split("\\s+");

        int[] stringAsNums = new int[numsAsString.length];
        for (int i = 0; i < stringAsNums.length; i++) {
            stringAsNums[i] = Integer.parseInt(numsAsString[i]);
        }

        //[10 5 5] 99 [3 4 2 5 1 1 4] - true

        boolean isEqual = false;
        for (int i = 0; i < stringAsNums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = i - 1; j >= 0; j--) {
                leftSum += stringAsNums[j];
            }

            for (int j = i + 1; j < stringAsNums.length; j++) {
                rightSum += stringAsNums[j];
            }

            if (rightSum == leftSum) {
                isEqual = true;
                System.out.println(i);
            }

        }

        if (!isEqual) {
            System.out.println("no");
        }


    }
}
