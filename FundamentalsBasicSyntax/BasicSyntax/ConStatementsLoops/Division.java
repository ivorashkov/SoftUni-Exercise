package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;


public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int divider = 0;
        if (number % 10 == 0) {
            divider = 10;

        } else if (number % 7 == 0) {
            divider = 7;

        } else if (number % 6 == 0) {
            divider = 6;

        } else if (number % 3 == 0) {
            divider = 3;

        } else if (number % 2 == 0) {
            divider = 2;

        }

        if (divider != 0) {
            System.out.printf("The number is divisible by %d%n", divider);
        } else {
            System.out.println("Not divisible");
        }
    }
}
