package AdvancedJava.Advanced.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readingMatrix(scanner);

        int number =  Integer.parseInt(scanner.nextLine());

        System.out.println(findCoordinates(matrix,number));


    }
    private static String findCoordinates(int[][] matrix, int number){
        List<String> outputLines = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number){
                    outputLines.add(row + " " + col);
                }
            }
        }
        return formatOutput(outputLines);
    }

    private static String formatOutput(List<String> outputLines){
        if (outputLines.isEmpty()){
            return  "not found";
        }
//        StringBuilder out = new StringBuilder();
//        for (String outputLine: outputLines) {
//            out.append(outputLine).append(System.lineSeparator());
//        }
//        return out.toString().trim();

        return String.join(System.lineSeparator(), outputLines);
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
