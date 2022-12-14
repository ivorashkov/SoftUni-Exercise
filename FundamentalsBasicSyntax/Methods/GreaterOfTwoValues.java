package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine().toLowerCase();

        if (type.equals("int")) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            int result = getMax(first, second);
            System.out.println(result);

        } else if (type.equals("char")) {
            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);
            char result = getMax(first, second);
            System.out.println(result);

        } else if (type.equals("string")) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            String result = getMax(first, second);
            System.out.println(result);

        }
    }

    static int getMax(int first, int second) {

        if (first > second) {
            return first;
        }
        return second;
    }

    static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
