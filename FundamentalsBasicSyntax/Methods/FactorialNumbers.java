package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class FactorialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum =  Integer.parseInt(scanner.nextLine());
        int secondNum =  Integer.parseInt(scanner.nextLine());

        long firstFac = factorialOfNumber(firstNum);
        long secondFac = factorialOfNumber(secondNum);

        System.out.printf("%.2f", 1.0 * firstFac / secondFac);

    }

    static long factorialOfNumber(int number){
        long factoriel = 1;

            for (int i = 2; i <= number; i++) {
               factoriel = factoriel * i;
            }

        return factoriel;
    }


}
