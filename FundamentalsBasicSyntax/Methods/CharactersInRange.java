package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printCharsBetween(first, second);

    }
//# - 35
// - C 67
    static void printCharsBetween(char first, char second){

        if (first > second){
            for (int i = second + 1; i < first; i++) {
                System.out.printf("%c ", i);
            }
        }else {
            for (int i = first + 1; i < second; i++) {
                System.out.printf("%c ", i);
            }
        }

    }

}
