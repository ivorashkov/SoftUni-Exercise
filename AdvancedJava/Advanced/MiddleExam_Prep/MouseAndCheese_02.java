package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.Scanner;

public class MouseAndCheese_02 {
    private static int row = 0;
    private static int col = 0;
    private static int cheeseCounter = 0;
    private static boolean isOutOfBound = false;
    private static boolean bonusReceived = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[size][size];

        for (int r = 0; r < field.length; r++) {
            char[] arr = scanner.nextLine().toCharArray();
            for (int c = 0; c < arr.length; c++) {
                field[r][c] = arr[c];

                if (arr[c] == 'M') {
                    row = r;
                    col = c;
                }
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.equals("up")) {
                move( field, -1, 0);
            } else if (command.equals("down")) {
                move(field, 1, 0);
            } else if (command.equals("left")) {
                move(field, 0, -1);
            } else if (command.equals("right")) {
                move(field, 0, 1);
            }

            if (isOutOfBound) {
                break;
            }

            command = scanner.nextLine();
        }

        if (isOutOfBound){
            System.out.println("Where is the mouse?");
        }

        if (cheeseCounter >= 5){
            System.out.println("Great job, the mouse is fed " + cheeseCounter + " cheeses!");
        }else{
            System.out.println("The mouse couldn't eat the cheeses, she needed " + (5 - cheeseCounter) + " cheeses more.");
        }

        printField(field);

    }

    private static void printField(char[][] field){
        for (char[] arr:field) {
            for (char c: arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void move(char[][] field, int rowMutation, int colMutation) {
        int nextRow = row + rowMutation;
        int nextCol = col + colMutation;

        if (!isInBound(field, nextRow, nextCol)) {
            field[row][col] = '-';
            isOutOfBound = true;
            return;
        }

        if (field[nextRow][nextCol] == 'c'){
            cheeseCounter++;
        }else if (field[nextRow][nextCol] == 'B'){
            bonusReceived = true;
        }

        field[row][col] = '-';
        field[nextRow][nextCol] = 'M';
        row = nextRow;
        col = nextCol;

        if (bonusReceived){
            bonusReceived = false;
            move(field,rowMutation,colMutation);
        }
    }

    private static boolean isInBound(char[][] field, int row, int col) {
        return row >= 0 && row < field.length && col >= 0 && col < field[row].length;
    }
}
