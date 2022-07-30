package AdvancedJava.OOP.Abstraction.CardBank;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");
       /* Arrays.stream(CardBank.values())
                .forEach(cardBank -> System.out.printf("Ordinal value: %d; Name value: %s%n",
                        cardBank.ordinal(), cardBank.name()));*/

        for (CardBank cardbank: CardBank.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    cardbank.ordinal(), cardbank.name());
        }
    }
}
