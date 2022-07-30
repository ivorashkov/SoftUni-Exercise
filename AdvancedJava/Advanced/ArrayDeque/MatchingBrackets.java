package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        String input = scanner.nextLine();

        for (int currentIndex = 0; currentIndex < input.length(); currentIndex++) {
            if ( input.charAt(currentIndex) == '('){
                indexes.push(currentIndex);
            }else if (input.charAt(currentIndex) == ')'){
                int startIndex = indexes.pop();
                System.out.println(input.substring(startIndex,currentIndex + 1));
            }
        }
    }
}
