package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10) {
            System.out.printf("%d X %d = %d%n", number1, multiplier, number1 * multiplier);

        } else {
            for (int i = multiplier; i <= 10; i++) {
                int result = number1 * i;
                System.out.printf("%d X %d = %d%n", number1, i, result);
            }


        }
    }
}
