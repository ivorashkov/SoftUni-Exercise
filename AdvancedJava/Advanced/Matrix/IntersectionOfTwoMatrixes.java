package AdvancedJava.Advanced.Matrix;

import java.util.Scanner;

public class IntersectionOfTwoMatrixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readCharMatrix(rows, cols, scanner);
        char[][] secondMatrix = readCharMatrix(rows, cols, scanner);

        char[][] result = finalMatrix(rows, cols, firstMatrix, secondMatrix);

        for (char[] c: result) {
            for (char ch:c) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }


    }

    private static char[][] finalMatrix(int rows, int cols, char[][] firstMatrix, char[][] secondMatrix) {
        char[][] thirdMatrix = new char[rows][cols];

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
               /* if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    thirdMatrix[row][col] = '*';
                } else {
                    thirdMatrix[row][col] = firstMatrix[row][col];
                }*/
                char fillChar = firstMatrix[row][col] == secondMatrix[row][col] ? firstMatrix[row][col] : '*';
                thirdMatrix[row][col] = fillChar;
            }
        }

        return thirdMatrix;
    }

    private static char[][] readCharMatrix(int rows, int cols, Scanner scanner) {

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine()
                    .replaceAll("\\s+", "")
                    .toCharArray();
        }

        return matrix;
    }

}
