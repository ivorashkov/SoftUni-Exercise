package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.Arrays;
import java.util.Scanner;

public class MATRIX_READER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**********************************************************
         *
         * INT MATRIX READ AND PRINT
         * 3
         * 12345
         * 543535
         * 22
         */

    /*    int rowSize = Integer.parseInt(scanner.nextLine());
        // int matrix
        int[][] matrix = new int[rowSize][];

        intMatrixReader(matrix, rowSize, scanner);
        matrixPrinter(matrix);
*/
        /*******************************************************************
         *
         * STRING MATRIX READ AND PRINT
         * 4
         * asdbafgajg
         * asdb
         * okokokk
         * gs
         */

        int rowSize =  Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[rowSize][];

        strMatrixReader(matrix, rowSize, scanner);
        matrixPrinterString(matrix);

        /*********************************************************
         *
         * CHAR MATRIX READ AND PRINT
         * 3
         * 1234sadx
         * da1
         * nems0
         */
/*

        int rowSize =  Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[rowSize][];

        charMatrixReader(matrix,rowSize,scanner);
        matrixPrinterChars(matrix);
*/


    }

    private static void matrixReader(char[][] matrix, Scanner scanner) {

    }
    private static void charMatrixReader(char[][] matrix, int rowSize, Scanner scanner){
        for (int r = 0; r < matrix.length; r++) {
            char[] line = scanner.nextLine().toCharArray();
            matrix[r] = line;
        }

      /*  / for (int row = 0; row < matrix.length; row++) {
            char[] line = scanner.nextLine().toCharArray();
            for (int col = 0; col < line.length; col++) {
                matrix[row] = line;

              *//*  if (line[col] == 'P') {
                    rowCords = row;
                    colCords = col;
                }*//*
            }

        }*/

  /*      for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            map[i] = line.toCharArray();

            if (line.contains("P")){
                row = i;
                col = line.indexOf("P");
            }
        }*/
    }
    private static void matrixPrinterChars(char[][] matrix){
        for (char[] ar : matrix) {
            for (char i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    private static void strMatrixReader(String[][] matrix, int rowSize, Scanner scanner){
        for (int r = 0; r < matrix.length; r++) {
            String line = scanner.nextLine();
            matrix[r] = line.split("");

           /* if (line.contains("P")){
                cordRow = r;
                cordCol = line.indexOf("P");
            }*/
        }
    }

    private static void intMatrixReader(int[][] matrix, int rowSize, Scanner scanner) {
        for (int r = 0; r < matrix.length; r++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            //директно слагаме целия масив в дадения ред
            matrix[r] = arr;
        }
    }

    private static void matrixPrinter(int[][] matrix){
        for (int[] ar : matrix) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void matrixPrinterString(String[][] matrix){
        for (String[] ar : matrix) {
            for (String i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
