package AdvancedJava.Advanced;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestStackAndDeque {
    public static void main(String[] args) {

        Deque<Integer> testDeque = new ArrayDeque<>();
        testDeque.add(10);
        testDeque.add(12);
        testDeque.add(15);


        while (testDeque.size() > 0) {
            System.out.println(testDeque.poll());
            if (testDeque.size() == 0) {
                System.out.println("the deque is empty: " + testDeque.size());
                break;
            }
        }

    /*    ArrayDeque<Integer> testOneDeque = new ArrayDeque<>();
        testOneDeque.add();
        testOneDeque.offer();*/


    }
}
