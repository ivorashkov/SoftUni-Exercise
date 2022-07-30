package AdvancedJava.Advanced.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readingMatrix(scanner);
        int[][] secondMatrix = readingMatrix(scanner);

        //boolean areEqual = compareMatrix(firstMatrix,secondMatrix);
        boolean areEqual = Arrays.deepEquals(firstMatrix,secondMatrix);
        String result = areEqual ? "equal" : "not equal";

        System.out.println(result);



    }

    private static boolean compareMatrix(int[][] firstMatrix, int[][] secondMatrix) {

        if (firstMatrix.length != secondMatrix.length){
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            int[] arr1 = firstMatrix[row];
            int[] arr2 = secondMatrix[row];

            if (arr1.length != arr2.length){
                return false;
            }
            for (int col = 0; col < firstMatrix.length; col++) {
                int elementFirst = arr1[col];
                int elementSecond = arr2[col];

                if (elementFirst != elementSecond){
                    return false;
                }
            }
        }


        return true;
    }

    private static int[][] readingMatrix(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;
        }

        return matrix;
    }
}
