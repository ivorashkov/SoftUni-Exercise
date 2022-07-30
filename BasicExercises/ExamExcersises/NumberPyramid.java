package BasicExercises.ExamExcersises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentNumber = 0;
        boolean isBigger  = false;
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                currentNumber++;
                if (currentNumber > n){
                    isBigger = true;
                    break;
                }
                System.out.print(currentNumber + " ");

            }
            if (isBigger){
                break;
            }
            System.out.println();
        }
    }
}
