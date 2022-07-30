package FundamentalsBasicSyntax.TextProcessing;

import java.util.Scanner;

public class ValidUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userInput = scanner.nextLine().split(", ");

        for (String user : userInput) {


            if (isValid(user)) {
                System.out.println(user);
            }
        }


    }

    static boolean isValid(String word) {

        if (word.length() < 3 || word.length() > 16) {
            return false;
        }

        for (char symbol : word.toCharArray()) {
            if (!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                return false;
            }
        }
        return true;
    }

}

