package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] input1 = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        int numbersOfElements = Integer.parseInt(input[0]);
        for (int i = 0; i < numbersOfElements; i++) {
            numbers.push(Integer.parseInt(input1[i]));
        }

        int numbersToPopFromStack =  Integer.parseInt(input[1]);
        for (int i = 0; i < numbersToPopFromStack; i++) {
            numbers.pop();
        }

        int numbersIfPresent =  Integer.parseInt(input[2]);
        boolean ifPresent = numbers.contains(numbersIfPresent);
        if (!ifPresent){
            if (numbers.isEmpty()){
                System.out.println(numbers.size());
            }else{
                int minValue = Integer.MAX_VALUE;
                for (Integer number : numbers) {
                    if (number < minValue){
                        minValue = number;
                    }
                }
                System.out.println(minValue);
            }
        }else{
            System.out.println(ifPresent);
        }


    }
}
