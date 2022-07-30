package FundamentalsBasicSyntax.MidExam.ActualExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cards = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")));

        int numberOfCards = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCards; i++) {
            String input = scanner.nextLine();
            String[] commands = input.split(", ");

            if (commands[0].equals("Add")) {
                String cardName = commands[1];

                if (cards.contains(cardName)) {
                    System.out.println("Card is already in the deck");
                } else {
                    cards.add(cardName);
                    System.out.println("Card successfully added");
                }

            } else if (commands[0].equals("Remove")) {
                String cardName = commands[1];
                if (cards.contains(cardName)) {
                    cards.remove(cardName);
                    System.out.println("Card successfully removed");
                } else {
                    System.out.println("Card not found");
                }

            } else if (commands[0].equals("Remove At")) {
                int index = Integer.parseInt(commands[1]);

                if (index < 0 || index > cards.size() - 1) {
                    System.out.println("Index out of range");
                } else {
                    cards.remove(index);
                    System.out.println("Card successfully removed");
                }

            } else if (commands[0].equals("Insert")) {
                int index = Integer.parseInt(commands[1]);
                String cardName = commands[2];

                if (index < 0 || index > cards.size() - 1) {
                    System.out.println("Index out of range");
                } else if (cards.contains(cardName)) {
                    System.out.println("Card is already added");
                } else {
                    cards.add(index, cardName);
                    System.out.println("Card successfully added");
                }
            }
        }

        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i));

            if (i != cards.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}
