package FundamentalsBasicSyntax.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulatorBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbersInRow = scanner.nextLine().toLowerCase();
        List<Integer> numbers = stringToIntArrayList(numbersInRow);

        String commands = scanner.nextLine().toLowerCase();
        while (!commands.equals("end")){
            String[] token = commands.split("\\s+");

            if (token[0].equals("add")){
                numbers.add(Integer.valueOf(token[1]));
            }else if (token[0].equals("remove")){
                numbers.remove(Integer.valueOf(token[1]));
            }else if (token[0].equals("removeat")){
                numbers.remove(Integer.parseInt(token[1]));
            }else if (token[0].equals("insert")) {
                numbers.add(Integer.parseInt(token[2]), Integer.parseInt(token[1]));//index, number
            }

            commands = scanner.nextLine().toLowerCase();
        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }
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
