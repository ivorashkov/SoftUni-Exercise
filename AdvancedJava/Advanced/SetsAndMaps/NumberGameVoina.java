package AdvancedJava.Advanced.SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class NumberGameVoina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));



        for (int rounds = 0; rounds < 50; rounds++) {

            int firsPlayerCard = firstDeck.iterator().next();
            firstDeck.remove(firsPlayerCard);

            int secondPlayerCard = secondDeck.iterator().next();
            secondDeck.remove(secondPlayerCard);

            if (firsPlayerCard > secondPlayerCard) {
                firstDeck.add(firsPlayerCard);
                firstDeck.add(secondPlayerCard);

            } else if (secondPlayerCard > firsPlayerCard) {
                secondDeck.add(firsPlayerCard);
                secondDeck.add(secondPlayerCard);

            } else {
                firstDeck.add(firsPlayerCard);
                secondDeck.add(secondPlayerCard);
            }

            if (firstDeck.isEmpty() || secondDeck.isEmpty()){
                break;
            }

    }

        if(firstDeck.size()>secondDeck.size())

    {
        System.out.println("First player win!");
    } else if(secondDeck.size()>firstDeck.size())

    {
        System.out.println("Second player win!");
    }else

    {
        System.out.println("Draw!");
    }
}
}
