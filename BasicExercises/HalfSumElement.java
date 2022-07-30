package BasicExercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int currentSum = 0;
        int biggestNum = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            currentSum += currentNum;

            if (currentNum > biggestNum){

                biggestNum = currentNum;
            }

        }
        int sumWithoutBiggestNum = currentSum - biggestNum;

        if (sumWithoutBiggestNum == biggestNum){
            System.out.printf("Yes%nSum = %d%n",biggestNum);

        }else{
            System.out.printf("No%nDiff = %d%n", Math.abs(biggestNum - sumWithoutBiggestNum));
        }
    }
}
