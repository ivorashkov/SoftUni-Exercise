package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(input).forEach(stack::push);

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
