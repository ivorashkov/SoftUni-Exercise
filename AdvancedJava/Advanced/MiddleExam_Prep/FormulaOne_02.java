package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.Scanner;

public class FormulaOne_02 {
    private static int rowCords = 0;
    private static int colCords = 0;
    private static int nextRow = 0;
    private static int nextCol = 0;
    private static boolean isFinishReached = false;
    private static boolean bonusReceived = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int commandsCount = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];
        matrixReader(matrix, scanner);
        while (commandsCount-- > 0) {
            String command = scanner.nextLine();

            if (command.equals("up")) {
                move(matrix, -1, 0);
            } else if (command.equals("down")) {
                move(matrix, 1, 0);
            } else if (command.equals("left")) {
                move(matrix, 0, -1);
            } else if (command.equals("right")) {
                move(matrix, 0, 1);
            }

            if (isFinishReached) {
                break;
            }
        }

        if (isFinishReached) {
            System.out.println("Well done, the player won first place!");
        } else {
            System.out.println("Oh no, the player got lost on the track!");
        }
        matrixPrinter(matrix);
    }

    private static boolean isInBound(char[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static void move(char[][] matrix, int rowMutator, int colMutator) {
        nextRow = rowCords + rowMutator;
        nextCol = colCords + colMutator;

        //todo logic when we exit the field
        newCordsIfOut(matrix, nextRow, nextCol);

        //todo logic when we receive Finish - F, Trap - T, Bonus - B
        if (matrix[nextRow][nextCol] == 'F') {
            matrix[rowCords][colCords] = '.';
            matrix[nextRow][nextCol] = 'P';
            isFinishReached = true;
            return;
        } else if (matrix[nextRow][nextCol] == 'T') {
            return;

        } else if (matrix[nextRow][nextCol] == 'B') {
            bonusReceived = true;
        }

        if (matrix[rowCords][colCords] != 'B' && matrix[rowCords][colCords] != 'T') {
            matrix[rowCords][colCords] = '.';
        }
        rowCords = nextRow;
        colCords = nextCol;

        if (bonusReceived) {
            bonusReceived = false;
            move(matrix, rowMutator, colMutator);
        }
        matrix[nextRow][nextCol] = 'P';
    }

    private static void newCordsIfOut(char[][] matrix, int nextR, int nextC) {
        if (!isInBound(matrix, nextR, nextC)) {
            if (nextC < 0) {
                //местим най-дясно
                nextC = matrix[rowCords].length - 1;
            } else if (nextCol >= matrix[rowCords].length) {
                //местим най-ляво
                nextC = 0;
            }

            if (nextR < 0) {
                //местим най-долу
                nextR = matrix.length - 1;
            } else if (nextR >= matrix.length) {
                //местим най-горе
                nextR = 0;
            }
        }
        nextRow = nextR;
        nextCol = nextC;
    }

    private static void matrixPrinter(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void matrixReader(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            char[] line = scanner.nextLine().toCharArray();
            for (int col = 0; col < line.length; col++) {
                matrix[row] = line;

                if (line[col] == 'P') {
                    rowCords = row;
                    colCords = col;
                }
            }
        }
    }
}
