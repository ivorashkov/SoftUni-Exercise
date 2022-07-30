package FundamentalsBasicSyntax.ArrayList;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersAsString = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        List<Integer> numbers = new ArrayList<>();

        for (String s : numbersAsString) {
            numbers.add(Integer.parseInt(s));
        }

        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("end")) {
            String[] command = input.split("\\s+");

            if (command[0].equals("add")) {
                numbers.add(Integer.parseInt(command[1]));
            } else if (command[0].equals("remove")) {
                if (Integer.parseInt(command[1]) > numbers.size() - 1 || Integer.parseInt(command[1]) < 0){
                    System.out.println("Invalid index");
                }else{
                    numbers.remove(Integer.parseInt(command[1]));
                }
            } else if (command[0].equals("shift")) {

                //shift left 3
                if (command[1].equals("left")) {
                    int repetitions = Integer.parseInt(command[2]);
                    for (int i = 0; i < repetitions; i++) {
                        int first = numbers.get(0);
                        numbers.add(first);
                        numbers.remove(0);
                    }
                } else if (command[1].equals("right")) {
                    int repetitions = Integer.parseInt(command[2]);
                    for (int i = 0; i < repetitions; i++) {
                        int last = numbers.get(numbers.size()-1);
                        numbers.add(0,last);
                        numbers.remove(numbers.size()-1);
                    }
                }
            }else if (command[0].equals("insert")){
                if (Integer.parseInt(command[2]) > numbers.size() - 1 || Integer.parseInt(command[2]) < 0){
                    System.out.println("Invalid index");
                }else{
                    //insert {number} {index}
                    numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                }
            }


            input = scanner.nextLine().toLowerCase();
        }
        numbers.forEach(number -> System.out.print(number + " "));


    }
}
