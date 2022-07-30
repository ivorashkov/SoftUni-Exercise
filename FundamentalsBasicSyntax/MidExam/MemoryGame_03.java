package FundamentalsBasicSyntax.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputRow = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        String input = scanner.nextLine().toLowerCase();
        int moves = 0;
        while (!input.equals("end")) {

            if (inputRow.size() > 0) {
                moves++; //броим ходовете
            }else{
                break;
            }

            String[] numbersAsString = input.split("\\s+");
            boolean isInvalid = (Integer.parseInt(numbersAsString[0]) == Integer.parseInt(numbersAsString[1]))
                    || (Integer.parseInt(numbersAsString[0]) < 0 || Integer.parseInt(numbersAsString[0]) >= inputRow.size())
                    || (Integer.parseInt(numbersAsString[1]) < 0 || Integer.parseInt(numbersAsString[1]) >= inputRow.size()) ;

            if (isInvalid) {
                System.out.println("Invalid input! Adding additional elements to the board");
                inputRow.add(inputRow.size() / 2, "-"+ moves + "a");
                inputRow.add(inputRow.size() / 2, "-" + moves + "a");
                input = scanner.nextLine().toLowerCase();
                continue;

            }
                //проверяваме за съответстващи стойности

                if (inputRow.get(Integer.parseInt(numbersAsString[0]))
                        .equals(inputRow.get(Integer.parseInt(numbersAsString[1])))) {
                    //сравняваме стойностите
                    System.out.printf("Congrats! You have found matching elements - %s!%n", inputRow.get(Integer.parseInt(numbersAsString[0])));
                    int count = 0;
                    int index = 0;
                    String value = inputRow.get(Integer.parseInt(numbersAsString[0]));
                    while (count != 2 && inputRow.size() > index) {
                        if (inputRow.get(index).equals(value)) {
                            inputRow.remove(index);
                            count++;
                        } else {
                            index++;
                        }
                    }
                } else {
                    System.out.println("Try again!");
                    input = scanner.nextLine().toLowerCase();
                    continue;
                }

            input = scanner.nextLine().toLowerCase();
        }

        if (inputRow.size() > 0) {
            System.out.println("Sorry you lose :(");
            inputRow.forEach(number -> System.out.print(number + " "));
        } else {
            System.out.printf("You have won in %d turns!", moves);
        }
    }

}

