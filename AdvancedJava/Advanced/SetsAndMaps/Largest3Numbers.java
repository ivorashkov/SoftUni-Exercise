package AdvancedJava.Advanced.SetsAndMaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collections.sort(numbers);
        Collections.reverse(numbers);


        if (numbers.size() > 3){
            for (int i = 0; i < 3; i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }else{
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }

    }
}
