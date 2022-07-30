package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class CondensedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] numAsString = input.split("\\s+");

        int[] numbers = new int[numAsString.length];

        for (int i = 0; i < numAsString.length; i++) {
            numbers[i] = Integer.parseInt(numAsString[i]);
        }

        while(numbers.length > 1){ //проверяваме дължината на главния масив

            //създаваме нов масив (дължина на оригиналния -1 за всяка итерация)
            int[] condensed = new int[numbers.length - 1];

            // i + 1 до предпоследния елемент
            for(int i = 0; i < numbers.length - 1; i++){

                //набиваме новата получена стойност в дадения индекс
                condensed[i] = numbers[i] + numbers [i + 1];
            }

            //присвояваме новите стойности
            numbers = condensed;
        }
        System.out.println(numbers[0]);
    }
}
