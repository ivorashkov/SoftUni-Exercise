package AdvancedJava.Advanced.ActualMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StickyFingers {
    private static int rowCords = 0;
    private static int colCords = 0;
    private static int pocketMoney = 0;
    private static boolean isCaught = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size =  Integer.parseInt(scanner.nextLine());
        List<String> commandsToMove = Arrays.asList(scanner.nextLine().split(","));

        char[][] matrix = new char[size][];
        matrixReader(matrix,scanner);

        int currentIndex = 0;
        while (currentIndex < commandsToMove.size()){
            if (isCaught){
                break;
            }

            String currentCommand = commandsToMove.get(currentIndex);
            currentIndex++;


            if (currentCommand.equals("up")) {
                move(matrix, -1, 0);
            } else if (currentCommand.equals("down")) {
                move(matrix, 1, 0);
            } else if (currentCommand.equals("right")) {
                move(matrix, 0, 1);
            } else if (currentCommand.equals("left")) {
                move(matrix, 0, -1);
            }

        }

        if (!isCaught){
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n",pocketMoney);
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }



    private static void move(char[][] matrix, int rowMutator, int colMutator){
        int nextRow = rowCords + rowMutator;
        int nextCol = colCords + colMutator;

        if (!isInBound(matrix, nextRow, nextCol)) {
            System.out.println("You cannot leave the town, there is police outside!");
            return;
        }

        if (matrix[nextRow][nextCol] == '$'){
            int stolenMoney = calculateStolenMoney(nextRow,nextCol);
            System.out.printf("You successfully stole %d$.%n", stolenMoney);
            pocketMoney += stolenMoney;
        }else if (matrix[nextRow][nextCol] == 'P'){
            matrix[rowCords][colCords] = '+';
            matrix[nextRow][nextCol] = '#';
            System.out.printf("You got caught with %d$, and you are going to jail.%n",pocketMoney);
            isCaught = true;
            return;
        }

        matrix[rowCords][colCords] = '+';
        matrix[nextRow][nextCol] = 'D';
        rowCords = nextRow;
        colCords = nextCol;
    }

    private static int calculateStolenMoney(int row, int col){
        return row * col;
    }

    private static boolean isInBound(char[][] map, int row, int col) {
        return row >= 0 && row < map.length && col >= 0 && col < map[row].length;
    }

    private static void matrixReader(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            char[] arr = line.toCharArray();
            for (int col = 0; col < arr.length; col++) {
                matrix[row] = arr;

                if (arr[col] == 'D') {
                    rowCords = row;
                    colCords = col;
                }

            }
        }
    }
}
