package FundamentalsBasicSyntax.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory_Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>journal = new ArrayList<>(Arrays.asList(scanner.nextLine().replaceAll(",","").split("\\s+")));

        String input = scanner.nextLine();
        while (!input.equals("Craft!")){
            String[] command = input.split("\\s+-\\s+");

            if (command[0].equals("Collect")){
                String item = command[1];

                if (!journal.contains(item)){
                    journal.add(item);
                }
            }else if (command[0].equals("Drop")){
                String item = command[1];

                if (journal.contains(item)){
                    journal.remove(item);
                }
            }else if (command[0].equals("Combine Items")){
                String[] items = command[1].split(":+");

                if (journal.contains(items[0])){
                    int indexOfOld = journal.indexOf(items[0]);
                    journal.add(indexOfOld + 1, items[1]);
                }
            }else if (command[0].equals("Renew")){
                String item = command[1];

                if (journal.contains(item)){
                    String duplicate = item;
                    journal.remove(item);
                    journal.add(item);
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < journal.size(); i++) {
            System.out.print(journal.get(i));

            if (i!= journal.size()-1){
                System.out.printf(", ");
            }
        }
    }
}
