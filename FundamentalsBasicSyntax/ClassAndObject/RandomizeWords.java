package FundamentalsBasicSyntax.ClassAndObject;

import java.util.*;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList =new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        Random randomWords = new Random();
        for (int i = wordsList.size()-1; i >= 0 ; i--) {
            String word = wordsList.remove(randomWords.nextInt(wordsList.size()));
            System.out.println(word);


        }

    }
}
