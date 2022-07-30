package FundamentalsBasicSyntax.FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("([@#])(?<word>[A-Za-z]{3,})\\1\\1(?<mirror>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        List<String> pairs = new ArrayList<>();
        while (matcher.find()) {
            count++;
            String firstWord = matcher.group("word");
            String secondWord = new StringBuilder(matcher.group("mirror")).reverse().toString();

            if (firstWord.equals(secondWord)) {
                pairs.add(firstWord + " <=> " + matcher.group("mirror"));
            }
        }

        if (count != 0){
            System.out.printf("%d word pairs found!%n", count);
        }else{
            System.out.println("No word pairs found!");
        }

        if (pairs.size() != 0){
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", pairs));
        }else{
            System.out.println("No mirror words!");
        }

    }
}

