package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.Scanner;

public class ThroneConquering_02 {

    private static int row = 0;
    private static int col = 0;
    private static int energy = 0;
    private static boolean isAbducted = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        energy = Integer.parseInt(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());


        char[][] map = new char[size][];
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            map[i] = line.toCharArray();

            if (line.contains("P")){
                row = i;
                col = line.indexOf("P");
            }
        }


        while (energy > 0) {
            energy--;
            String[] commands = scanner.nextLine().split("\\s+");
            //Sparta Spawn
            map[Integer.parseInt(commands[1])][Integer.parseInt(commands[2])] = 'S';

            if (commands[0].equals("up")) {
                move(map, -1, 0);
            } else if (commands[0].equals("down")) {
                move(map, 1, 0);
            } else if (commands[0].equals("left")) {
                move(map, 0, -1);
            } else if (commands[0].equals("right")) {
                move(map, 0, 1);
            }

            if (isAbducted) {
                System.out.println("Paris has successfully abducted Helen! Energy left: " + energy);
                break;
            }
        }
        if (energy <= 0){
            System.out.printf("Paris died at %d;%d.%n", row, col);
        }

        printMap(map);
    }

    private static void move(char[][] map, int rowMutator, int colMutator) {

        int nextRow = row + rowMutator;
        int nextCol = col + colMutator;

        if (!isInBound(map, nextRow, nextCol)) {
            return;
        }

        if (map[nextRow][nextCol] == ('S')) {
            energy -= 2;
        }

        if (energy <= 0) {
            map[nextRow][nextCol] = 'X';
            map[row][col] = '-';
            row = nextRow;
            col = nextCol;
            return;
        }

        if (map[nextRow][nextCol]==('H')) {
            map[row][col] = '-';
            map[nextRow][nextCol] = '-';
            isAbducted = true;
            return;
        }



        map[nextRow][nextCol] = 'P';
        map[row][col] = '-';
        row = nextRow;
        col = nextCol;

    }

    private static boolean isInBound(char[][] map, int row, int col) {
        return row >= 0 && row < map.length && col >= 0 && col < map[row].length;
    }

    private static void printMap(char[][] map) {
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                System.out.print(map[row][col]);
            }
            System.out.println();
        }
    }

}
