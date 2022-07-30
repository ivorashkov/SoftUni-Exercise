package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //факториел от 5! = 5*4*3*2*1
        //n! = n*(n-1)*(n-2)..1

        int number = Integer.parseInt(scanner.nextLine());
        int startNumer = number;
        int sumFactDigits = 0;//сумата от факториелите на цифрите

        //1. вземаме всички цифри на 1 число
        //number % 10 - вземаме последната цидра на числото
        //number / 10 - премахваме последната цифра на числото

        while (number != 0) {
            int lastDigit = number % 10;

            int fact = 1; //fact of Last digit
            for (int i = 1; i <= lastDigit; i++) {
                fact *= i;
            }

            sumFactDigits += fact;
            number /= 10;


        }


        //strong
        if (startNumer == sumFactDigits) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
