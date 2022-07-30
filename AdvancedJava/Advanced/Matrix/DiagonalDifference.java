package AdvancedJava.Advanced.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[value][];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int firstDiagonalSum = 0;
        for (int counter = 0; counter < matrix.length; counter++) {
            firstDiagonalSum += matrix[counter][counter];
        }


        int secondDiagonalSum = 0;
        /*for (int row = 0, col = matrix.length - 1; row < matrix.length; row++, col--) {
                secondDiagonalSum += matrix[row][col];
        }*/

        for (int row = 0; row < matrix.length; row++) {
           secondDiagonalSum += matrix[row][value - row - 1];
        }

        System.out.println(Math.abs(firstDiagonalSum - secondDiagonalSum));

    }
}


