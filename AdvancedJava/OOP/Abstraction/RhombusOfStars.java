package AdvancedJava.OOP.Abstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printRhombus(n);

    }

    public static void printRhombus(int size){
        for (int row = 1; row <=size; row++) {
            printThriangle(size - row, row);
        }
        for (int row = 1; row < size; row++) {
            printThriangle(row,size-row);
        }
    }

    private static void printThriangle(int firstCount, int secondCount) {
        for (int spaces = 0; spaces < firstCount; spaces++) {
            System.out.print(" ");
        }

        for (int stars = 0; stars < secondCount; stars++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
