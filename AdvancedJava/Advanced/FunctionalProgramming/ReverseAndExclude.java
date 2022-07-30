package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n =  Integer.parseInt(scanner.nextLine());

        numbers = numbers.stream().filter(num -> num % n != 0)
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        numbers.forEach(e -> System.out.print(e + " "));

    }
}
