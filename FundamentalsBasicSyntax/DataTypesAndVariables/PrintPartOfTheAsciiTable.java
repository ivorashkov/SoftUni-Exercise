package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfTheAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum =  Integer.parseInt(scanner.nextLine());
        int secondNum =  Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum ; i++) {


            System.out.printf("%c ", (char)i);

        }
    }
}
