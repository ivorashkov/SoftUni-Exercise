package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        //password string position from 0 to N -
        //  userName.length() - 1 guarantee last character
        for (int position = userName.length() - 1; position >= 0; position--) {

            //current position symbol extraction
            char currentSymbol = userName.charAt(position);

            //System.out.println(userName.charAt(position)); - print all chars from all iterrations

            //concatenate symbol to password
            password += currentSymbol;
        }

        String input = scanner.nextLine();
        int incorrectCount = 0;

        while (!input.equals(password)) {
            incorrectCount++;

            if (incorrectCount >= 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.printf("Incorrect password. Try again.%n");
            input = scanner.nextLine();

        }


        if (input.equals(password)){
            System.out.printf("User %s logged in.", userName);
        }


    }
}
