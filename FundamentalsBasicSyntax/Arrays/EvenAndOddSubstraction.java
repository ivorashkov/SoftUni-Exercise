package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringArray = input.split("\\s+");

        int sumOdd = 0;
        int sumEven = 0;
        for (String s : stringArray) {
            int toInt = Integer.parseInt(s);

            if (toInt % 2 == 0) {
                sumEven += toInt;
            }else{
                sumOdd += toInt;
            }
        }

        System.out.println(sumEven - sumOdd);
    }
}
