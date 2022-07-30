package BasicExercises;

import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

       int leftSum = 0;
        for (int i = 0; i < number; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            leftSum += currentNum;
        }

       int rightSum = 0;
        for (int i = 0; i < number; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            rightSum += currentNum;

        }

        if (rightSum == leftSum){

            System.out.printf("Yes, sum = %d", rightSum);
        }else{
            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
        }
    }
}
