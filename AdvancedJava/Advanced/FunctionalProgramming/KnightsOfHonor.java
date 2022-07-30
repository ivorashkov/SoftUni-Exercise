package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> titlePrinter = p -> System.out.println("Sir " + p);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(titlePrinter);
    }
}
