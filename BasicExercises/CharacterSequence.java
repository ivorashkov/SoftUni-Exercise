package BasicExercises;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);

            System.out.println(symbol);

        }
    }
}
