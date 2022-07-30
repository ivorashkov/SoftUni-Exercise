package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> names = new ArrayDeque<>();
        names.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        //ArrayDeque<String> names = new ArrayDeque<>(Arrays.asList(scanner.nextLine().split(" ")));->Queue


        int number = Integer.parseInt(scanner.nextLine());
        int totalNumber = 0;
        while (names.size() > 1) {
            totalNumber++;
            for (int i = 1; i < number; i++) {
                names.offer(names.poll());
            }

            int count = 0;
            for (int i = 1; i <= totalNumber; i++) {
                if (totalNumber % i == 0){
                    count++;
                }
                if (count > 2){
                    break;
                }
            }

            if (count == 2) {
                System.out.printf("Prime %s%n", names.peek());

            } else {
                System.out.printf("Removed %s%n", names.poll());
            }

        }
        System.out.println("Last is " + names.poll());
    }
}
