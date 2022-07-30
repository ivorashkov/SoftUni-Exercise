package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


       /* Function<int[], Integer> smallest = (int[] arr) -> {
            int min = Integer.MAX_VALUE;
            for (int n:arr) {
                if (n < min){
                    min = n;
                }
            }
            return min;
        };*/

        Function<int[],Integer> function = arr -> Arrays.stream(arr).min().getAsInt();
        //Function<int[],Integer> func = arr -> Collections.min(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        System.out.println(function.apply(numbers));
    }
}
