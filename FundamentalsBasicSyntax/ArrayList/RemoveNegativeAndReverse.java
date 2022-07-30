package FundamentalsBasicSyntax.ArrayList;

import java.util.*;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = stringListToIntegerList(scanner.nextLine());
        Collections.reverse(numbers);
        if (numbers.size() > 0){
            for (int n:numbers) {
                System.out.print(n + " ");
            }
        }else{
            System.out.println("empty");
        }



    }

    private static List<Integer> stringListToIntegerList(String input) {
        List<String> numbersAsString = new ArrayList<>(Arrays.asList(input.split("\\s+")));
        List<Integer> numbers = new ArrayList<>();

        for (String s:numbersAsString) {
            if (Integer.parseInt(s) > 0){
                numbers.add(Integer.parseInt(s));
            }
        }
        return numbers;
    }
}
