package FundamentalsBasicSyntax.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guestsNames = new ArrayList<>();

        int repetitions =  Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < repetitions; i++) {
            String[] commandInput = scanner.nextLine().split("\\s+");

            if (commandInput[2].equals("going!")){
                if (guestsNames.contains(commandInput[0])){
                    System.out.printf("%s is already in the list!%n",commandInput[0]);
                }else{
                    guestsNames.add(commandInput[0]);
                }
            }else if (commandInput[2].equals("not")){
                if (guestsNames.contains(commandInput[0])){
                    guestsNames.remove(commandInput[0]);
                }else{
                    System.out.printf("%s is not in the list!%n",commandInput[0]);
                }
            }
        }
        for (String s:guestsNames) {
            System.out.println(s + " ");
        }
    }
}
