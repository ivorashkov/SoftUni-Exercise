package FundamentalsBasicSyntax.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetNumbers = stringListToIntegerList(scanner);
        int shot=0;
        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("end")) {
            int shootIndex = Integer.parseInt(input);
            boolean isValidIndex = shootIndex >= 0 && shootIndex < targetNumbers.size();
            if (!isValidIndex){
                input = scanner.nextLine().toLowerCase();
                continue;
            }else{
                int currentNum = targetNumbers.get(shootIndex);//вземаме числото от индекса
                targetNumbers.set(shootIndex, -1);
                shot++;
                for (int i = 0; i < targetNumbers.size(); i++) {
                    if (i != shootIndex && targetNumbers.get(i) != -1) {

                        if (targetNumbers.get(i) > currentNum) {
                            targetNumbers.set(i, targetNumbers.get(i) - currentNum);
                        } else if (targetNumbers.get(i) <= currentNum) {
                            targetNumbers.set(i, targetNumbers.get(i) + currentNum);
                        }
                    }
                }
            }


            input = scanner.nextLine().toLowerCase();
        }
        System.out.printf("Shot targets: %d -> ",shot);
        targetNumbers.forEach(number-> System.out.print(number + " "));
    }

    //"12 14 166 89 213"
    private static List<Integer> stringListToIntegerList(Scanner scanner) {
        List<String> sequenceOfTargetsString = new ArrayList<>(Arrays.asList(scanner.nextLine().toLowerCase().split("\\s+")));
        List<Integer> sequenceNumbers = new ArrayList<>();
        sequenceOfTargetsString.forEach(number -> sequenceNumbers.add(Integer.parseInt(number)));

        return sequenceNumbers;
    }

}
