package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.Scanner;

public class Armory_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] armory = new char[size][size];
        int[] currPosition = new int[2];
        fillTheMatrix(armory, size, scanner, currPosition);
        int[] money = new int[1];
        int[] isOut = new int[1];
        int[] areMoneyEnough = new int[1];

        while (true) {
            String direction = scanner.nextLine();
            move(armory, currPosition, money, direction, isOut, areMoneyEnough);
            if (isOut[0] == 1 || areMoneyEnough[0] == 1) {
                break;
            }
        }
        if (isOut[0] == 1) {
            System.out.println("I do not need more swords!");
        }

        if (isOut[0] == 0 && money[0] >= 65) {
            System.out.println("Very nice swords, I will come back for more!");
        }
//        System.out.printf("Money: %d%n", money[0]);
        System.out.printf("The king paid %d gold coins. %n", money[0]);
        printTheMatrix(armory);
    }

    private static void printTheMatrix(char[][] armory) {
        for (int row = 0; row < armory.length; row++) {
            for (int col = 0; col < armory.length; col++) {
                System.out.print(armory[row][col]);
            }
            System.out.println();
        }
    }

    private static void move(char[][] armory, int[] currPosition, int[] money, String direction, int[] isOut, int[] areMoneyEnough) {
        int newRowPosition = 0;
        int newColPosition = 0;
        if (direction.equals("up")) {
            if (currPosition[0] == 0) {
                isOut[0] = 1;
                armory[currPosition[0]][currPosition[1]] = '-';
            } else {
                newRowPosition = currPosition[0] - 1;
            }
            newColPosition = currPosition[1];
        }else if (direction.equals("down")) {
            if (currPosition[0] == armory.length - 1) {
                isOut[0] = 1;
                armory[currPosition[0]][currPosition[1]] = '-';
            } else {
                newRowPosition = currPosition[0] + 1;
            }
            newColPosition = currPosition[1];
        }else if (direction.equals("left")) {
            if (currPosition[1] == 0) {
                isOut[0] = 1;
                armory[currPosition[0]][currPosition[1]] = '-';
            } else {
                newColPosition = currPosition[1] - 1;
            }
            newRowPosition = currPosition[0];
        }else if (direction.equals("right")) {
            if (currPosition[1] == armory.length - 1) {
                isOut[0] = 1;
                armory[currPosition[0]][currPosition[1]] = '-';
            } else {
                newColPosition = currPosition[1] + 1;
            }
            newRowPosition = currPosition[0];
        }
        if (isOut[0] == 1) {
            return;
        }
        if (Character.isDigit(armory[newRowPosition][newColPosition])) {
            money[0] += Character.getNumericValue(armory[newRowPosition][newColPosition]);
            armory[currPosition[0]][currPosition[1]] = '-';
            armory[newRowPosition][newColPosition] = 'A';
            currPosition[0] = newRowPosition;
            currPosition[1] = newColPosition;
        }else if (armory[newRowPosition][newColPosition] == 'M') {
            armory[currPosition[0]][currPosition[1]] = '-';
            armory[newRowPosition][newColPosition] = '-';
            int[] newPosition = findOtherPillar(armory);
            currPosition[0] = newPosition[0];
            currPosition[1] = newPosition[1];
            armory[currPosition[0]][currPosition[1]] = 'A';
        }else {
            armory[currPosition[0]][currPosition[1]] = '-';
            armory[newRowPosition][newColPosition] = 'A';
            currPosition[0] = newRowPosition;
            currPosition[1] = newColPosition;
        }
        if (money[0] >= 65) {
            areMoneyEnough[0] = 1;
        }
    }

    private static int[] findOtherPillar(char[][] matrix) {
        int[] otherPillarPosition = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char currChar = matrix[row][col];
                if (currChar == 'M') {
                    otherPillarPosition[0] = row;
                    otherPillarPosition[1] = col;
                }
            }
        }
        return otherPillarPosition;
    }

    private static void fillTheMatrix(char[][] armory, int size, Scanner scanner, int[] currPosition) {
        for (int row = 0; row < size; row++) {
            String currLine = scanner.nextLine();
            for (int col = 0; col < size; col++) {
                char currChar = currLine.charAt(col);
                armory[row][col] = currChar;
                if (currChar == 'A') {
                    currPosition[0] = row;
                    currPosition[1] = col;
                }
            }
        }
    }
}