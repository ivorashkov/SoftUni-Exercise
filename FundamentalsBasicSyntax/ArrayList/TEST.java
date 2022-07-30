package FundamentalsBasicSyntax.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);












//        List<Integer> neighborhood = new ArrayList<>(Arrays.asList(7, 4, 2, 2));
//        int i = 0;
//        neighborhood.set(i, neighborhood.get(i) - 2);
//        System.out.println(neighborhood.get(i) + " value of number");
//        neighborhood.set(i, neighborhood.get(i) - 2);
//        System.out.println(neighborhood.get(i) + " value of number");

//        stringListToIntegerList(scanner);

//        System.out.println(sequenceNumbers.size());
//        System.out.println(sequenceNumbers.size() - 1);
//
//        int index = 1;
//        ;
//        int radius = 2;
//        ;
//
//        //52 {74} 23 {44} 96 110
//
//        if (index + radius > sequenceNumbers.size()-1){
//            System.out.println("biggerIndex idiot");
//        }else if (index - radius < 0){
//            System.out.println("the index is smaller");
//        }else{
//            sequenceNumbers.remove(index + radius);
//            sequenceNumbers.remove(index);
//            sequenceNumbers.remove(index - radius);
//        }
//        for (int n:sequenceNumbers) {
//            System.out.print(n + " ");
//        }


//        List<String> values = new ArrayList<>(Arrays.asList("1a","b","1a","3","3"));
//        String[] stoinosti = new String[]{"2","0"};
//
//        System.out.println(values);
//        System.out.println(values.get(Integer.parseInt(stoinosti[0]))); //[0] = 2 => // 1
//        boolean isEqual = values.get(Integer.parseInt(stoinosti[0])).equals(values.get(Integer.parseInt(stoinosti[1])));
//        System.out.println(isEqual);


//        List<Integer> numbers = stringToIntArrayList(scanner.nextLine().toLowerCase());
//        List<Integer> newList  = stringListToIntegerList(scanner.nextLine().toLowerCase());

    }

    private static List<Integer> stringListToIntegerList(Scanner scanner) {
        List<String> sequenceOfTargetsString = new ArrayList<>(Arrays.asList(scanner.nextLine().toLowerCase().split("\\s+")));
        List<Integer> sequenceNumbers = new ArrayList<>();
        sequenceOfTargetsString.forEach(number -> sequenceNumbers.add(Integer.parseInt(number)));
        return sequenceNumbers;
    }

    private static List<Integer> stringToIntArrayList(String input) {

        String[] stringNumbers = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : stringNumbers) {
            numbers.add(Integer.parseInt(s));//insert from Array to List
        }
        return numbers;
    }

    private static List<Integer> stringListToIntegerList(String input) {
        List<String> numbersAsString = new ArrayList<>(Arrays.asList(input.split("\\s+")));
        List<Integer> numbers = new ArrayList<>();

        for (String s : numbersAsString) {
            if (Integer.parseInt(s) > 0) {
                numbers.add(Integer.parseInt(s));
            }
        }
        return numbers;
    }

    private static void removeEqualElementsFromList(List<Integer> numbers, String[] command) {
        int commandNumber = Integer.parseInt(command[1]);
        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i).equals(commandNumber)) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
    }
}
