package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

       String result = repeatString(input,repetitions);

        System.out.printf("%s", result);

    }

    static String repeatString(String word, int repetitions){
        String something = "";
        for (int i = 0; i < repetitions; i++) {
            System.out.printf("%s",word);
        }
        return something;
    }
}
