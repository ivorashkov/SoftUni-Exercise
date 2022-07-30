package FundamentalsBasicSyntax.TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(",\\s+");
        String text = scanner.nextLine();

        for (String banword : bannedWords) {
            String censored = repeat("*", banword.length());
            text = text.replace(banword,censored);
        }

        System.out.println(text);
    }

    private static String repeat(String word, int repetitions) {
        //спрямо дължината на думата добавя стойност
        char[] repeated = new char[word.length() * repetitions];

        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt(i % word.length());
        }
        return new String(repeated);
    }
}
