package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        getMiddleCharacter(input);

    }

    static void getMiddleCharacter(String input) {

        if (input.length() % 2 == 0) {

            System.out.printf("%s%s", input.charAt(input.length() / 2 - 1),  input.charAt(input.length() / 2));
        } else {

            System.out.println(input.charAt(input.length() / 2));
        }


    }
}
