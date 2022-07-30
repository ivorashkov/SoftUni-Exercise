package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class SignOfInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printIngegers(number);

    }

    static void printIngegers(int number) {

        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else  if (number == 0){
            System.out.printf("The number %d is zero.", number);
        }else{
            System.out.printf("The number %d is positive.", number);
        }

    }
}
