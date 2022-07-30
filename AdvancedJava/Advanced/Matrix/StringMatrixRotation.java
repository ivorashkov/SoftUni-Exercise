package AdvancedJava.Advanced.Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();

        String input = scanner.nextLine();

        List<String> wordList = new ArrayList<>();
        int maxColLength = Integer.MIN_VALUE;

        while (!input.equals("END")) {
            int currentLength = input.length();

            if (currentLength > maxColLength) {
                maxColLength = currentLength;
            }
            wordList.add(input);
            input = scanner.nextLine();
        }

        int rows = wordList.size();
        int cols = maxColLength;

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String currentWord = wordList.get(row);
            for (int col = 0; col < matrix[row].length; col++) {

                if (col < currentWord.length()) {
                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' ';
                }
            }

        }

        String angleString = rotation.split("[()]")[1];
        int angle = Integer.parseInt(angleString);

        int angleOfRotation = angle % 360;

        printMatrix(matrix, rows, cols, angleOfRotation);


    }

    private static void printMatrix(char[][] matrix, int rows, int cols, int angleOfRotation) {

        if (angleOfRotation == 0) {
            //dont rotate at all
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleOfRotation == 90) {
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angleOfRotation == 180) {
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = cols - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angleOfRotation == 270) {
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
    }


}
