package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] strToArray = input.split("\\s+");

        int[] numbers = new int[strToArray.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strToArray[i]);
        }


        int MagicSum = Integer.parseInt(scanner.nextLine());
        for (int currentNum = 0; currentNum < numbers.length; currentNum++) {

            for (int plus = currentNum + 1; plus <numbers.length; plus++) {
                if (numbers[currentNum] + numbers[plus] == MagicSum){
                    System.out.printf("%d %d%n",numbers[currentNum] ,numbers[plus]);
                }
            }
        }
    }
}
