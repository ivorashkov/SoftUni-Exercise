package FundamentalsBasicSyntax.TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        String firstWord = input[0];
        String secondWord = input[1];

        int sum = sumValuesOf(firstWord,secondWord);
        System.out.println(sum);


    }

    private static int sumValuesOf(String firstWord, String secondWord) {
        int sum = 0;

        if (firstWord.length() == secondWord.length()){

            for (int i = 0; i < firstWord.length(); i++) {
                sum += firstWord.charAt(i) * secondWord.charAt(i);
            }

        }else if (firstWord.length() > secondWord.length()){
           String remainings = firstWord.substring(secondWord.length());

            for (int i = 0; i < secondWord.length(); i++) {
                sum += firstWord.charAt(i) * secondWord.charAt(i);
            }
            for (int i = 0; i < remainings.length(); i++) {
                sum+=remainings.charAt(i);
            }

        }else if (firstWord.length() < secondWord.length()){
            String remainings = secondWord.substring(firstWord.length());

            for (int i = 0; i < firstWord.length(); i++) {
                sum += firstWord.charAt(i) * secondWord.charAt(i);
            }
            for (int i = 0; i < remainings.length(); i++) {
                sum+=remainings.charAt(i);
            }

        }
    return sum;
    }
}
