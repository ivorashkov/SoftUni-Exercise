package BasicExercises.NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());//1
        int endNum = Integer.parseInt(scanner.nextLine());//10
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isValidComb = false;
        int count = 0;
        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                count++;

                int sum = i + j;

                if (sum == magicNum) {
                    isValidComb = true;

                    //The number of the first combination which is equal to magicNum
                    System.out.printf("Combination N:%d (%d + %d = %d)%n",
                            count, i, j, sum);
                    break;
                }
            }
            if (isValidComb) {
                break;
            }
        }

        if (!isValidComb) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }


    }
}
