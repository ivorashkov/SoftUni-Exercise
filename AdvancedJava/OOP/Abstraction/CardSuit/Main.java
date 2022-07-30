package AdvancedJava.OOP.Abstraction.CardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // System.out.println(CardSuit.DIAMONDS.ordinal());
       // System.out.println(CardSuit.DIAMONDS.name());
        System.out.println("Card Suits:");
        Arrays.stream(CardSuit.values())//вземаме всички стойности от енумерациите.
                .forEach(cardSuit -> System.out.printf("Ordinal value: %d; Name value: %s%n",
                            cardSuit.ordinal(), cardSuit.name()));
    }
}
