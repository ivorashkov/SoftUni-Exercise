package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] stringArray =  input.split("\\s+");

        for (int i = 0; i < stringArray.length / 2; i++) {
            int otherIndex = stringArray.length - 1 - i;
            String secondValue = stringArray[otherIndex]; // d c
            // <-a b c || d e

            String temporary = stringArray[i]; // a b
            stringArray[i] = secondValue;
            stringArray[otherIndex] = temporary;

            // A B C D E//
            //temporary -  A
            //secondValue - E
            //stringArray[i] = secondValue; E -> i
            //temporary -> secondvalue

        }

//        for (String s : stringArray ) {
//            System.out.print(s + " ");
//        }

        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }

    }
}
