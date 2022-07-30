package BasicExercises.ExamOne;

import java.util.Scanner;

public class P06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int first = input.charAt(0);
        int second = input.charAt(1);
        int third = input.charAt(2);
        for (char i = '1'; i <= third; i++) {
            for (char j = '1'; j <= second; j++) {
                for (char k = '1'; k <= first; k++) {

                    boolean isTrue = i <= third && j <= second && k <= first;
                    if (isTrue){
                        int one = Character.getNumericValue(i);
                        int two = Character.getNumericValue(j);
                        int three = Character.getNumericValue(k);
                        int result = one * two * three;

                        System.out.printf("%c * %c * %c = %d;%n", i, j, k, result);

                    }
                }
            }
        }

    }


}