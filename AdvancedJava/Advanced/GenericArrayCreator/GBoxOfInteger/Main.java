package AdvancedJava.Advanced.GenericArrayCreator.GBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        while (number -- > 0){
            GenericBoxOfInteger<Integer> box = new GenericBoxOfInteger<>(Integer.parseInt(scanner.nextLine()));
            System.out.println(box);
        }
    }

}
