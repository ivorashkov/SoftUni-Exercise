package BasicExercises.LoopExercises;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {

            //Проверява реда дали е първи или последен и слага * или | в зависимост от реда
            if (i == 1 || i == input) {
                System.out.printf("+ ");
            } else {
                System.out.printf("| ");
            }

            //принтира средните символи които са input - 2, тъй като не са заети от крайните 2 елемента
            for (int j = 1; j <= input - 2; j++) {
                System.out.printf("- ");
            }

            //Пак проверява дали елемента до който е достигнало е първи или последен
            if (i == 1 || i == input) {
                System.out.printf("+ ");
            } else {
                System.out.printf("| ");
            }

            System.out.println();
        }
    }
}
