package FundamentalsBasicSyntax.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = stringToIntArrayList(scanner.nextLine());

        numbers = gaussTrickMethod(numbers);

        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> gaussTrickMethod(List<Integer> numbers) {
        List<Integer> newNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {
            int otherIndex = numbers.size() - 1 - i;
            newNumbers.add(numbers.get(i) + numbers.get(otherIndex));
        }
        if (numbers.size() % 2 != 0){
            int midNum = numbers.size() / 2;
            // check if the List count is odd and adds the middle element
            newNumbers.add(numbers.get(midNum));
        }
        numbers = newNumbers;
        return numbers;
    }

    private static List<Integer> stringToIntArrayList(String input) {
        String[] stringNumbers = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : stringNumbers) {
            numbers.add(Integer.parseInt(s));//insert from Array to List
        }
        return numbers;
    }
}
