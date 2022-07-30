package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(i ->  Integer.parseInt(i)).toArray();
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int numberOfElementsToAdd =  commands[0];
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            queue.offer(numbers[i]);
        }

        int numberOfElementsToDel =  commands[1];
        for (int i = 0; i < numberOfElementsToDel; i++) {
            queue.poll();
        }

        int containsNumber =  commands[2];
        boolean isPresent = queue.contains(containsNumber);
        if (isPresent){
            System.out.println(isPresent);
        }else{
            if (queue.isEmpty()){
                System.out.println("0");
            }else{
                int minValue = queue.stream()
                        .min(Integer::compare)
                        .get();
                System.out.println(minValue);
            }

        }

    }
}
