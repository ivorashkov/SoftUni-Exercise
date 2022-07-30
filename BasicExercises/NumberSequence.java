package BasicExercises;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum > maxNum){
                maxNum = currentNum;
            }
            if (currentNum < minNum){
                minNum = currentNum;
            }

        }
        System.out.printf("Max number: %d%nMin number: %d%n", maxNum, minNum);
    }
}
