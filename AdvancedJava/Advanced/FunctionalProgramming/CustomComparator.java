package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        //Write a custom comparator that sorts all even numbers before all odd ones in ascending order. Pass it to an Arrays.sort() function and print the result.
        //1 2 3 4 5 6 ->2 4 6 1 3 5 // -3 2 ->	2 -3
        Comparator<Integer> comparator = (num1, num2) -> {
            if (num1 % 2 == 0 && num2 % 2 != 0) {
                //num1 chetno
                //num2 nechetno

                return -1;
            } else if (num1 % 2 != 0 && num2 % 2 == 0) {
                //num1 nechetno
                //num2 chetno

                return 1;
            } else {
                return num1.compareTo(num2);
            }
        };
        Arrays.sort(numbers, comparator);
        Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
    }
}
