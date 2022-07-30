package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();
        String[] firstArray = inputOne.split("\\s+");
        String[] secondArray = inputTwo.split("\\s+");

//        for (int i = 0; i < secondArray.length; i++) {
//            for (int j = 0; j < firstArray.length; j++) {
//
//                if (firstArray[j].compareTo(secondArray[i]) == 0 ){
//                    System.out.print(secondArray[i] + " ");
//                }
//            }
//        }

        for (String secondWord : secondArray) {
            for (String firstWord : firstArray) {

                if (secondWord.equals(firstWord)){
                    System.out.print(secondWord + " ");
                }
            }
        }

    }
}
