package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for (int i = 1; i <= number; i++) {
            //important formula for oddNumber for each iteration
            int oddNumber = 2 * i - 1;
            System.out.println(oddNumber);
            sum += oddNumber;


        }
        System.out.printf("Sum: %d", sum);
    }
}
