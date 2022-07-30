package FundamentalsBasicSyntax.RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\+359)([- ])2\\2\\d{3}\\2\\d{4}\\b");
        Matcher matcher = pattern.matcher(input);
        List<String> numbers = new ArrayList<>();
        while (matcher.find()){
            numbers.add(matcher.group());
        }

        int count=0;
        for (String s:numbers){
            System.out.print(s);
            count++;
            if (count!=numbers.size()){
                System.out.print(", ");
            }
        }
    }
}
