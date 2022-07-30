package FundamentalsBasicSyntax.TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removedWord = scanner.nextLine();
        String text = scanner.nextLine();
        int removeIndex = text.indexOf(removedWord);


        while (removeIndex != -1){
            StringBuilder result= new StringBuilder();
            result.append(text.substring(0,removeIndex));
            result.append(text.substring(removeIndex + removedWord.length()));

            text = result.toString();
            removeIndex = text.indexOf(removedWord);
        }

        System.out.printf("%s",text);
    }
}
