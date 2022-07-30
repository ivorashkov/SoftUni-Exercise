package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int[] array1 = new int[input];
        int[] array2 = new int[input];

        for (int i = 1; i <= input; i++) {
            String reveiced = scanner.nextLine();
            //към инт променлива парсвам текстов запис от масив на позиция 0
            int firstNumber = Integer.parseInt(reveiced.split("\\s+")[0]);
            int secondNumber = Integer.parseInt(reveiced.split("\\s+")[1]);

            if (i % 2 == 0) {
                array1[i - 1] = secondNumber;
                array2[i - 1] = firstNumber;
            } else {
                array1[i - 1] = firstNumber;
                array2[i - 1] = secondNumber;
            }
        }


//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] + " ");
//
//        }
//        System.out.println();
//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2[i] + " ");
//
//        }

        for (int number:array1) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number: array2){
            System.out.print(number + " ");
        }

    }
}
