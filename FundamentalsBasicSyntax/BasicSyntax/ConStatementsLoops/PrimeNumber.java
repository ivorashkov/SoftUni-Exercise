package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //число е просто ако има 2 делителя ( 1 и самото число)
        int count = 0; //брой на делителите

        //съставните числа имат повече от 2 делителя
        //прости имат само 2 делителя

        for (int i = 1; i <= number; i++) {

            if (number % i == 0){
                count++;

            }
            if (count > 2){
                break;
            }


        }

        if (count == 2){
            System.out.println("Prime");
        }else{
            System.out.println("No Prime");
        }
    }
}
