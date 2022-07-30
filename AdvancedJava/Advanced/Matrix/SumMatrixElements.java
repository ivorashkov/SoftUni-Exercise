package AdvancedJava.Advanced.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][];

        for (int row = 0; row < matrix.length; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;
        }

        int sum = 0;

        for (int[] arr:matrix) {
            for (int num:arr) {
                sum += num;
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
