package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 0;
        boolean isTrue = false;
        for (int number = 1; number <= input; number++) {
            //takova = number;
            while (number > 0) {
                sum += number % 10;
                 currentNum = number / 10;
            }
            isTrue =  (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", number, isTrue);
            sum = 0;
//            ch = takova;
        }
    }


}

//not successful
