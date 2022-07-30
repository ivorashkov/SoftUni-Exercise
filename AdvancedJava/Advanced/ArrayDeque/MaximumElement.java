package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        //System.out.printf("%d commands%n",numberOfCommands);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            if (command.equals("1")) {
                int element = Integer.parseInt(input[1]);
                stack.push(element);
              //  System.out.printf("Push %d%n", element);

            } else if (command.equals("2")) {
                stack.pop();
              //  System.out.println("Pop an element");

            } else if (command.equals("3")) {
                int maxValue = stack.stream()
                        .max(Integer::compare)
                        .get();
                System.out.printf("%d%n", maxValue);
            }
        }

    }
}
