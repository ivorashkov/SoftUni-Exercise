package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        List<String> forwardList = new ArrayList<>(1);
        String input = scanner.nextLine();
        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (stack.size() > 1) {
                    forwardList.add(0, stack.pop());
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }

            } else if (input.equals("forward")) {

                if (forwardList.size() > 0) {
                    stack.push(forwardList.get(0));
                    System.out.printf("%s%n",forwardList.remove(0));
                } else {
                    System.out.println("no next URLs");
                }

            } else {
                stack.push(input);
                forwardList = new ArrayList<>();
                System.out.println(stack.peek());
            }
            input = scanner.nextLine();
        }
    }
}
