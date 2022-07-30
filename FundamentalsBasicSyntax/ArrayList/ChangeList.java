package FundamentalsBasicSyntax.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = stringListToIntegerList(scanner.nextLine().toLowerCase());
        String input = scanner.nextLine().toLowerCase();

        while (!input.equals("end")){
            String[] command = input.split("\\s+");
            if (command[0].equals("delete")){
                removeEqualElementsFromList(numbers,command);
            }else if (command[0].equals("insert")){
                numbers.add(Integer.parseInt(command[2]),Integer.parseInt(command[1]));
            }
            input = scanner.nextLine().toLowerCase();
        }

        for (int n:numbers) {
            System.out.print(n + " ");
        }
    }

    private static void removeEqualElementsFromList(List<Integer> numbers, String[] command) {
        int commandNumber = Integer.parseInt(command[1]);
        int i = 0;
        while (i < numbers.size()){
            if (numbers.get(i).equals(commandNumber)){
                numbers.remove(i);
            }else{
                i++;
            }
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
