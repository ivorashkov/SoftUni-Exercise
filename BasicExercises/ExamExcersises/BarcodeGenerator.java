package BasicExercises.ExamExcersises;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String firstNum = scanner.nextLine();
//        String secondNum = scanner.nextLine();
//        //2345
//        //6789
//        for (int i = firstNum.charAt(0); i <= secondNum.charAt(0); i++) {
//            if (i % 2 == 0) continue;
//            for (int j = firstNum.charAt(1); j <= secondNum.charAt(1); j++) {
//                if (j % 2 == 0) continue;
//                for (int k = firstNum.charAt(2); k <= secondNum.charAt(2); k++) {
//                    if (k % 2 == 0) continue;
//                    for (int l = firstNum.charAt(3); l <= secondNum.charAt(3); l++) {
//                        if (l % 2 == 0) continue;
//
//                        System.out.printf("%c%c%c%c ", i, j, k, l);
//                    }
//                }
//            }
//        }
        Scanner scanner = new Scanner(System.in);

        String firstNum = scanner.nextLine();
        String secondNum = scanner.nextLine();
        for (int i = firstNum.charAt(0); i <= secondNum.charAt(0); i++) {
            for (int j = firstNum.charAt(1); j <= secondNum.charAt(1); j++) {
                for (int k = firstNum.charAt(2); k <= secondNum.charAt(2); k++) {
                    for (int l = firstNum.charAt(3); l <= secondNum.charAt(3); l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}

            



