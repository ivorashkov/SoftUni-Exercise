package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        boolean isTrue = true;
        while(isTrue){

            if (inputNumber % 2 == 0){
                isTrue = false;
                System.out.printf("The number is: %d%n",Math.abs(inputNumber));
            }else{
                System.out.printf("Please write an even number.%n");
                inputNumber = Integer.parseInt(scanner.nextLine());
            }
        }

    }
}
