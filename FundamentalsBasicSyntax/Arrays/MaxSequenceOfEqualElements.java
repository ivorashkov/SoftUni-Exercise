package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringArray = input.split("\\s+");


        int[] stringAsNumbers = new int[stringArray.length];

        for (int i = 0; i < stringAsNumbers.length; i++) {
            stringAsNumbers[i] = Integer.parseInt(stringArray[i]);
        }

        int longestLength = 0;
        int currentLength = 1;
        int longestValue = 1;
        for (int i = 0; i < stringAsNumbers.length - 1; i++) {
            if (stringAsNumbers[i] == stringAsNumbers[i + 1]) {
                currentLength++;

                if (longestLength < currentLength){
                    longestLength = currentLength;
                    longestValue = stringAsNumbers[i];
                }

            }else{

                currentLength = 1;
            }

        }

        for (int i = 0; i < longestLength; i++) {
            System.out.print(longestValue + " ");
        }
    }
}
