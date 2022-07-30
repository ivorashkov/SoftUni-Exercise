package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();

        String[] firstArray = inputOne.split("\\s+");
        String[] secondArray= inputTwo.split("\\s+");


        int difference=0;
        int sum = 0;
        boolean isEqual;

        if (firstArray.length != secondArray.length){
            isEqual= false;
        }else{
            isEqual=true;
            for (int i = 0; i < firstArray.length; i++) {
                int currentOne = Integer.parseInt(firstArray[i]);
                int currentTwo = Integer.parseInt(secondArray[i]);

                if (currentOne != currentTwo){
                    isEqual = false;
                    difference = i;
                    break;
                }else{
                    int currentNum = Integer.parseInt(firstArray[i]);
                    sum += currentNum;
                }
            }
        }

        if (isEqual){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.", difference);
        }

    }
}
