package FundamentalsBasicSyntax.FinalExam.ActualExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =  Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
           String string = scanner.nextLine();

            Pattern pattern = Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[(?<str>[A-Za-z]{8,})]");
            Matcher matcher = pattern.matcher(string);

            if (matcher.find()){
                String com = matcher.group("command");
                String str = matcher.group("str");

                System.out.print(com + ":");
                for (int j = 0; j < str.length(); j++) {
                    int current = str.charAt(j);
                    System.out.printf(" %d", current);
                }
                System.out.println();

            }else{
                System.out.println("The message is invalid");
            }


        }
    }
}
