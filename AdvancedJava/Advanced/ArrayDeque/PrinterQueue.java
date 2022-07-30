package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> fileNameQueue = new ArrayDeque<>();

        while (!input.equals("print")) {

            if (input.equals("cancel") && fileNameQueue.isEmpty()){
                System.out.println("Printer is on standby");
            }else if (input.equals("cancel")){
                System.out.printf("Canceled %s%n",fileNameQueue.poll());
            }else{
                fileNameQueue.offer(input);
            }

            input = scanner.nextLine();
        }

        for (String string : fileNameQueue) {
            System.out.println(string);
        }


    }
}
