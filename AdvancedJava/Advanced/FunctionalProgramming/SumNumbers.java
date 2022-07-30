package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Count = " + numbers.length);
        System.out.println("Sum = " + Arrays.stream(numbers).sum());

        //second Option
       /* List<Integer> nums = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>,String> countFormatter = list -> "Count = " + list.size();

        String countOutput = countFormatter.apply(nums);
        System.out.println(countOutput);

        Function<List<Integer>,Integer> sumAllElements = list -> list.stream().mapToInt(e -> e).sum();
        //reduce identity ->начална стойност, в дясно описваме какво се случва с елементите
        Function<List<Integer>,Integer> sumAllElements1 = list -> list.stream()
                .reduce(0,(f,s) -> f + s);
        Function<Integer,String> sumFormatter = sum -> "Sum = " + sum;

        int sum = sumAllElements.apply(nums);
        String outPut = sumFormatter.apply(sum);

        System.out.println(outPut);*/


    }
}
