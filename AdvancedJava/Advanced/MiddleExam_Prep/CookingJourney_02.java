
package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.Scanner;

public class CookingJourney_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[size][size];
        int[] characterCoords = new int[2];
        int[] firstPillarCords = new int[2];
        int[] secondPillarCords = new int[2];
        //reading matrix

        boolean weFoundFirstPiller = false;
        for (int rows = 0; rows < size; rows++) {
            String[] input = scanner.nextLine().split("");
            for (int cols = 0; cols < size; cols++) {
                matrix[rows][cols] = input[cols];

                if (matrix[rows][cols].equals("S")) {
                    characterCoords[0] = rows;
                    characterCoords[1] = cols;
                }

                if (matrix[rows][cols].equals("P") && !weFoundFirstPiller) {
                    firstPillarCords[0] = rows;
                    firstPillarCords[1] = cols;
                    weFoundFirstPiller = true;
                }

                if (matrix[rows][cols].equals("P") && weFoundFirstPiller) {
                    secondPillarCords[0] = rows;
                    secondPillarCords[1] = cols;
                }
            }
        }
        int money = 0;

        while (money < 50) {
            String command = scanner.nextLine();

            //oldPosition
            int oldRow = characterCoords[0];
            int oldCol = characterCoords[1];
            if (command.equals("left")) {
                //currentCol - 1;
                characterCoords[1] -= 1;

            } else if (command.equals("right")) {
                //currentCol +1;
                characterCoords[1]++;

            } else if (command.equals("up")) {
                //currentRow -1;
                characterCoords[0] -= 1;

            } else if (command.equals("down")) {
                //currentRow + 1;
                characterCoords[0] += 1;

            }

            if (characterCoords[0] < 0 || characterCoords[1] < 0 || characterCoords[0] >= size || characterCoords[1] >= size) {
                matrix[oldRow][oldCol] = "-";
                break;
            }

            if (characterCoords[0] == firstPillarCords[0] && characterCoords[1] == firstPillarCords[1]){
                //отиваме на 2рия пилон
                characterCoords[0] = secondPillarCords[0];
                characterCoords[1] = secondPillarCords[1];

                //old Position char
                matrix[oldRow][oldCol] = "-";
               //обновяваме знака на старите координати
                matrix[firstPillarCords[0]][firstPillarCords[1]] = "-";
                //обновяваме знака на новите координати
                matrix[characterCoords[0]][characterCoords[1]] = "S";


            }else if (characterCoords[0] == secondPillarCords[0] && characterCoords[1] == secondPillarCords[1]){
                //отиваме на 1вия пилон
                characterCoords[0] = firstPillarCords[0];
                characterCoords[1] = firstPillarCords[1];
                //old Position char
                matrix[oldRow][oldCol] = "-";
                //обновяваме знака на старите координати
                matrix[firstPillarCords[0]][firstPillarCords[1]] = "-";
                //обновяваме знака на новите координати
                matrix[characterCoords[0]][characterCoords[1]] = "S";
            }else if (matrix[characterCoords[0]][characterCoords[1]].equals("-")){
                //попадаме на празна клетка
                matrix[oldRow][oldCol] = "-";
                matrix[characterCoords[0]][characterCoords[1]] = "S";
            }else if (matrix[characterCoords[0]][characterCoords[1]].matches("\\d+")){
                //клетка с пари
                money +=  Integer.parseInt(matrix[characterCoords[0]][characterCoords[1]]);
                matrix[oldRow][oldCol] = "-";
                matrix[characterCoords[0]][characterCoords[1]] = "S";
            }
        }
        if (money >= 50){
            System.out.println("Good news! You succeeded in collecting enough money!");
        }else{
            System.out.println("Bad news! You are out of the pastry shop.");
        }
        System.out.println("Money: " + money);

        //Print matrix
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }


    }
}

