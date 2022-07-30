package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {

            int specialNumber = i;
            int sum = 0;

            while (specialNumber !=0){

                sum = specialNumber % 10 + sum;
                specialNumber = specialNumber / 10;

            }

            if (sum == 5 || sum == 7 || sum == 11){

                System.out.printf("%d -> True%n", i);
            }else{
                System.out.printf("%d -> False%n", i);
            }

        }

    }
}
