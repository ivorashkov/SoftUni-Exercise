package FundamentalsBasicSyntax.TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word:words) {

            for (int i = 0; i < word.length(); i++) {
                result.append(word);
            }
        }

        System.out.printf("%s",result);
    }
}
