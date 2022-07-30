package FundamentalsBasicSyntax.TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        String text = scanner.nextLine();

        char firstLetter = text.charAt(0);
        result.append(firstLetter);
        for (int i = 1; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol != result.charAt(result.length()-1)){
                result.append(currentSymbol);
            }
        }

        System.out.println(result);

    }
}
