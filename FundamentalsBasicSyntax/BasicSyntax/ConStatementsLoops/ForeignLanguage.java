package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class ForeignLanguage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String language = scanner.nextLine();

        switch (language) {
            case "England":
            case "USA":
                System.out.printf("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.printf("Spanish");
                break;
            default:
                System.out.printf("unknown");
        }
    }
}
