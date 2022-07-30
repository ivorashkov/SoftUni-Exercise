package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.Scanner;

public class PresentDelivery_02 {
    private static int rowCords = 0;
    private static int colCords = 0;
    private static int nextRow = 0;
    private static int nextCol = 0;
    private static int countOfGoodKids = 0;
    private static int countOfSadGoodKids = 0;
    private static boolean sadGoodKids = false;
    private static int countOfPresents = 0;
    private static boolean outOfTheMap = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        countOfPresents = Integer.parseInt(scanner.nextLine());
        int sizeOfHood = Integer.parseInt(scanner.nextLine());

        char[][] neighborHood = new char[sizeOfHood][];
        matrixReader(neighborHood, scanner);

        String command = scanner.nextLine();
        while (countOfPresents > 0) {

            if (command.equals("Christmas morning")) {
                break;
            }

            if (command.equals("up")) {
                move(neighborHood, -1, 0);
            } else if (command.equals("down")) {
                move(neighborHood, 1, 0);
            } else if (command.equals("right")) {
                move(neighborHood, 0, 1);
            } else if (command.equals("left")) {
                move(neighborHood, 0, -1);
            }

            if (outOfTheMap) {
                break;
            }
            if (!isEnoughPresents(countOfPresents)) {
                break;
            }
            command = scanner.nextLine();
        }
        if (outOfTheMap || countOfPresents <=0){
            System.out.println("Santa ran out of presents!");
        }
        matrixPrinter(neighborHood);

        if (sadGoodKids){
            System.out.println("No presents for " + countOfSadGoodKids + " nice kid/s.");
        }else{
            System.out.println("Good job, Santa! " + countOfGoodKids + " happy nice kid/s.");
        }
    }



    private static void move(char[][] matrix, int rowMutator, int colMutator) {
        nextRow = rowCords + rowMutator;
        nextCol = colCords + colMutator;

        if (!isInBound(matrix, nextRow, nextCol)) {
            outOfTheMap = true;
            return;
        }

        if (matrix[nextRow][nextCol] == 'C') { //cookies C
            moveForwardAndLeaveNothing(matrix);//rowCords & colCords updated here
            //dont move santa, only give presents to all around him

            int checkAround =4;
            while (checkAround-- > 0) {
                if (!isEnoughPresents(countOfPresents)) {
                    return;
                }
                if (matrix[rowCords][colCords - 1] != '-') {
                    countOfPresents--;//left
                    matrix[rowCords][colCords - 1] = '-';
                }else if (matrix[rowCords][colCords + 1] != '-') {
                    countOfPresents--;//right
                    matrix[rowCords][colCords + 1] = '-';
                }else if (matrix[rowCords - 1][colCords] != '-') {
                    countOfPresents--;//up
                    matrix[rowCords - 1][colCords] = '-';
                }else if (matrix[rowCords + 1][colCords] != '-') {
                    countOfPresents--;//down
                    matrix[rowCords + 1][colCords] = '-';
                }
            }
        }

        if (matrix[nextRow][nextCol] == 'X') {//naughty kid with X
            matrix[rowCords][colCords] = '-';
            rowCords = nextRow;
            colCords = nextCol;
            return;
        }else if (matrix[nextRow][nextCol] == 'V'){ //good kid with V
            countOfPresents--;
        }

        //moving part below
        matrix[rowCords][colCords] = '-';
        matrix[nextRow][nextCol] = 'S';
        rowCords = nextRow;
        colCords = nextCol;
    }

    private static boolean isEnoughPresents(int presents) {
        return presents > 0;
    }

    private static void moveForwardAndLeaveNothing(char[][] matrix) {
        matrix[rowCords][colCords] = '-';
        matrix[nextRow][nextCol] = 'S';
        rowCords = nextRow;
        colCords = nextCol;
    }

    private static boolean isInBound(char[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static void matrixPrinter(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
                if (matrix[row][col] == 'V'){
                    countOfSadGoodKids ++;
                    sadGoodKids = true;
                }
            }
            System.out.println();
        }
    }

    private static void matrixReader(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            char[] arr = line.toCharArray();
            for (int col = 0; col < arr.length; col++) {
                matrix[row] = arr;

                if (arr[col] == 'S') {
                    rowCords = row;
                    colCords = col;
                }else if (arr[col] == 'V' || arr[col] == 'C'){
                    countOfGoodKids++;
                }

            }
        }
    }
}
