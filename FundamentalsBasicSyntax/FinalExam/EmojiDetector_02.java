package FundamentalsBasicSyntax.FinalExam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int threshNumber = 1;
        Pattern threshold = Pattern.compile("(?<digit>\\d)");
        Matcher threshMatcher = threshold.matcher(text);

        while (threshMatcher.find()) {
            int currentNum = Integer.parseInt(threshMatcher.group());
            threshNumber *= currentNum;
        }

        Pattern emojiPattern = Pattern.compile("([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher emojiMatcher = emojiPattern.matcher(text);

        int emojiCount = 0;
        List<String> emojies = new ArrayList<>();
        while (emojiMatcher.find()) {
            emojiCount++;

            int totalEmojiValue = 0;
            String emoji = emojiMatcher.group("emoji");
            for (char c:emoji.toCharArray()) {
                totalEmojiValue += c;
            }

            if (totalEmojiValue > threshNumber){
                emojies.add(emojiMatcher.group());
            }
        }

        System.out.println("Cool threshold: " + threshNumber);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",emojiCount);

        emojies.forEach(System.out::println);


    }
}
