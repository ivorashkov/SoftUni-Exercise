package FundamentalsBasicSyntax.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[] characters = text.toCharArray();
        List<Character> result = new ArrayList<>();
        for (char ch : characters) {
            result.add(ch);
        }

        int power = 0;
        int index = 0;
        while (index < result.size()) {
            if (Character.isDigit(result.get(index))) {
                int currentpow = result.get(index) - '0';
                power += currentpow;
            }
            char currentChar = result.get(index);
            if (power != 0 && Character.isLetterOrDigit(currentChar)) {
                result.remove(index);
                power--;
            }else{
                index++;
            }
        }
        result.forEach(System.out::print);
    }
}


