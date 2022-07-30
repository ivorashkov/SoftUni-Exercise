package FundamentalsBasicSyntax.MidExam;

import java.util.*;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numRowString = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        List<Integer> numbers = new ArrayList<>();
        numRowString.forEach(number->numbers.add(Integer.parseInt(number)));

        String input = scanner.nextLine().toLowerCase();
        while(!input.equals("end")){
            String[] commands = input.split("\\s+");

            if (commands[0].equals("swap")){
                Collections.swap(numbers,Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
            }else if (commands[0].equals("multiply")){
                int firstIndex = Integer.parseInt(commands[1]);
                int secondIndex = Integer.parseInt(commands[2]);
                int firstNum = numbers.get(firstIndex);
                int secondNum = numbers.get(secondIndex);
                Integer result = firstNum * secondNum;
                numbers.set(firstIndex, result);

            }else if (commands[0].equals("decrease")){
                for (int i = 0; i < numbers.size(); i++) {
                    Integer minusOneValue = numbers.get(i) - 1;
                    numbers.set(i,minusOneValue);
                }
            }
            input = scanner.nextLine().toLowerCase();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));

            if (i != numbers.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
