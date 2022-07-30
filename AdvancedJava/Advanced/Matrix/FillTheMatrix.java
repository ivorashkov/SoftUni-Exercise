package AdvancedJava.Advanced.Matrix;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(", ");
        int dimensions = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[dimensions][dimensions];
        if (type.equals("A")) {
            matrix = matrixPatternA(dimensions, matrix);
            printMatrix(matrix);
        } else if (type.equals("B")) {
            matrix = matrixPatternB(dimensions, matrix);
            printMatrix(matrix);

        }
    }
    private static void printMatrix (int[][] matrix){
        for (int[] arr:matrix) {
            for (int num: arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


    private static int[][] matrixPatternB(int dimensions, int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < dimensions; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < dimensions; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            } else {
                for (int row = dimensions - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }
        return matrix;
    }


    private static int[][] matrixPatternA(int dimensions, int[][] matrix) {

        int startValue = 1;
        for (int col = 0; col < dimensions; col++) {
            for (int row = 0; row < dimensions; row++) {
                matrix[row][col] = startValue;
                startValue++;
            }
        }
        return matrix;
    }

}

