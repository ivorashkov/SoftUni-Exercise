package AdvancedJava.OOP.Abstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardBank cardBank = CardBank.valueOf(scanner.nextLine());//cardBank.TWO for example
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());//CardSuit.CLUBS for example

        Card card = new Card(cardSuit, cardBank);

        System.out.printf("Card name: %s of %s; Card power: %d",card.getCardBank(), card.getCardSuit(), card.getPower());
    }
}
