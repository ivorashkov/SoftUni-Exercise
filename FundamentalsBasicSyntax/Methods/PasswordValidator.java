package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine().toLowerCase();

        passwordValidator(password);
    }

    static void passwordValidator(String password) {

        boolean isValidLength = true;
        if (!isValidLength(password)) {
            isValidLength = false;
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidCharacters = true;
        if (!validCharacters(password)) {
            isValidCharacters = false;
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidDigitLength = true;
        if (!validDigitLength(password)) {
            isValidDigitLength = false;
            System.out.println("Password must have at least 2 digits");
        }



        if (isValidCharacters && isValidDigitLength && isValidLength) {
            System.out.println("Password is valid");
        }


    }

    private static boolean validDigitLength(String password) {
        int digit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digit++;
            }
        }
        if (digit >= 2) {
            return true;
        }
        return false;
    }

    private static boolean validCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') ||
                    (password.charAt(i) >= '0' && password.charAt(i) <= '9'))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidLength(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.length() < 6 || password.length() > 10) {
                return false;
            }

        }
        return true;
    }
}
