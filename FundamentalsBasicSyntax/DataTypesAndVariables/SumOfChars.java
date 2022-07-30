package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number =  Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            String characters = scanner.nextLine();

            sum += (int)characters.charAt(0);

        }

        System.out.printf("The sum equals: %d", sum);
    }
}
