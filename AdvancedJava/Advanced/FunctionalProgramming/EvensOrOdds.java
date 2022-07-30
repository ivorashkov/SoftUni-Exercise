package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class EvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String condition = scanner.nextLine();

        Predicate<Integer> isEven = i -> i % 2 ==0;
        int start = range[0];
        int end = range[1];
        for (int number = start; number <= end; number++) {

            if (condition.equals("even")){
                if (isEven.test(number)){
                    System.out.print(number + " ");
                }
            }else{
                if (!isEven.test(number)){
                    System.out.print(number + " ");
                }
            }
        }
    }
}
