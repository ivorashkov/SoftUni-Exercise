package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DequeTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // Stack
        ArrayDeque<Integer> male = new ArrayDeque<Integer>();
        Arrays.stream(scanner.nextLine().split("\s+")).map(Integer::parseInt).forEach(male::push);

        // Quene
        ArrayDeque<Integer> female = Arrays.stream(scanner.nextLine().split("\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        int count = 0;
        while (!male.isEmpty() && !female.isEmpty()) {
            int women=female.peek();
            int men=male.peek();

            if (women <= 0) {
                female.poll();
                continue;
            }
            if (men <= 0) {
                male.pop();
                continue;
            }

            if (women % 25 == 0) {
                female.poll();
                female.poll();
                continue;
            }
            if (men % 25 == 0) {
                male.pop();
                male.pop();
                continue;
            }
            if (women == men) {
                female.poll();
                male.pop();
                count++;
            } else {
                female.poll();
                int help = male.pop() - 2;
                male.push(help);
            }
        }
        System.out.println("Matches: " + count);
        System.out.println("Males left: " + print(male));
        System.out.println("Females left: " + print(female));
    }

    private static String print(ArrayDeque<Integer> struct) {
        return struct.isEmpty() ? "none" : struct.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }
}
