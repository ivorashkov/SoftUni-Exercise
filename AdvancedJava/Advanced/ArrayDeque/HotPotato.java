package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> names = new ArrayDeque<>();
        names.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        //ArrayDeque<String> names = new ArrayDeque<>(Arrays.asList(scanner.nextLine().split(" ")));->Queue


        Integer n = Integer.parseInt(scanner.nextLine());
        while (names.size() > 1) {
            for (int i = 1; i < n; i++) {
                names.offer(names.poll());
            }

            System.out.println("Removed " + names.poll());
        }

        System.out.println("Last is " + names.poll());
    }
}

