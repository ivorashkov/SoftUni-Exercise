package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Function<List<Integer>,Integer> minElementIndex  = list -> {
          int minElement = Integer.MAX_VALUE;
          int minIndex = -1;

            for (int index = 0; index < list.size(); index++) {
                if (list.get(index) <= minElement){
                    minElement = list.get(index);
                    minIndex = index;
                }
            }
            return minIndex;
        };

       /* Function<List<Integer>, Integer> minIndexFunc = integerList ->{
          int minElement =  integerList.stream().mapToInt(e -> e).min().getAsInt();
          return integerList.lastIndexOf(minElement);
        };*/
        System.out.println(minElementIndex.apply(nums));
    }

}
