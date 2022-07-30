package FundamentalsBasicSyntax.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sequenceOfTargetsString = new ArrayList<>(Arrays.asList(scanner.nextLine().toLowerCase().split("\\s+")));
        List<Integer> sequenceNumbers = new ArrayList<>();
        sequenceOfTargetsString.forEach(number -> sequenceNumbers.add(Integer.parseInt(number)));

        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("end")) {
            String[] commands = input.split("\\s+");

            if (commands[0].equals("shoot")) {
                int index = Integer.parseInt(commands[1]);
                int power = Integer.parseInt(commands[2]);

                if (index >= 0 && index < sequenceNumbers.size()){
                    if (power < sequenceNumbers.get(index)){
                        int current = sequenceNumbers.get(index);
                        sequenceNumbers.set(index, current - power);
                    }else{
                        sequenceNumbers.remove(index);
                    }
                }

            } else if (commands[0].equals("add")) {
                int index = Integer.parseInt(commands[1]);
                int value = Integer.parseInt(commands[2]);

                if (index >= 0 && index < sequenceNumbers.size()) {
                    sequenceNumbers.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (commands[0].equals("strike")) {
                int index = Integer.parseInt(commands[1]);
                int radius = Integer.parseInt(commands[2]);

                if (index >= 0 && index < sequenceNumbers.size()) {
                    if ((index + radius >= sequenceNumbers.size()) || (index - radius < 0)) {
                        System.out.println("Strike missed!");
                    } else {

                        int i = index + radius;
                        while (i >= index-radius){
                            sequenceNumbers.remove(i);
                            i--;
                        }
                    }
                }
            }
            input = scanner.nextLine().toLowerCase();
        }
        for (int i = 0; i < sequenceNumbers.size(); i++) {
            System.out.print(sequenceNumbers.get(i));

            if ( i != sequenceNumbers.size() - 1){
                System.out.print("|");
            }
        }
    }
}
