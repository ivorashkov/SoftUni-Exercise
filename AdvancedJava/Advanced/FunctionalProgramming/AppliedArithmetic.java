package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> addFunction = numbersList -> numbersList.stream()
                .map(e -> e + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunction = numbersList -> numbersList.stream()
                .map(e -> e * 2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunction = numbersList -> numbersList.stream()
                .map(e -> e - 1).collect(Collectors.toList());
        Consumer<List<Integer>> printer = (List<Integer> list) -> list.forEach(e -> System.out.print(e + " "));
        // Consumer<Integer> printer = number -> System.out.printf("%d ",number);

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.equals("add")) {
                numbers = addFunction.apply(numbers);
            } else if (input.equals("multiply")) {
                numbers = multiplyFunction.apply(numbers);
            } else if (input.equals("subtract")) {
                numbers = subtractFunction.apply(numbers);
            } else if (input.equals("print")) {
                printer.accept(numbers);
                System.out.println();
                // numbers.forEach(printer);
            }

            input = scanner.nextLine();
        }


    }
}
