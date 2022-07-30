package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Predicate<String> nameCheck = n -> n.length() <= length;

        //само филтрираме и отпечатваме имената, без да променяме списъка с данни.
        names.stream().filter(nameCheck)
                .forEach(System.out::println);

    }
}
