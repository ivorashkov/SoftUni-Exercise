package FundamentalsBasicSyntax.TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int encryptionKey = 3;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int encryptedValue = input.charAt(i) + encryptionKey;
            result.append((char)encryptedValue);

        }

        String encrypted = result.toString();
        System.out.println(encrypted);
    }
}
