package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> upperCaseWord = w -> Character.isUpperCase(w.charAt(0));
        List<String> upperCase = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(upperCaseWord)
                .collect(Collectors.toList());

        System.out.println(upperCase.size());
        System.out.println(String.join(System.lineSeparator(),upperCase));

        /*Consumer<String> priner = w -> System.out.println();
        upperCase.forEach(priner);*/

    }
}
