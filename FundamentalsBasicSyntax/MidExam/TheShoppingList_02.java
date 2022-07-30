package FundamentalsBasicSyntax.MidExam;

import java.util.*;

public class TheShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialList = new ArrayList<>(Arrays.asList(scanner.nextLine().split("!")));

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] command = input.split("\\s+");

            if (command[0].equals("Urgent")) {
                String product = command[1];

                if (!initialList.contains(product)) {
                    initialList.add(0, product);
                }
            } else if (command[0].equals("Unnecessary")) {
                String product = command[1];

                if (initialList.contains(product)) {
                    initialList.remove(product);
                }
            } else if (command[0].equals("Correct")) {
                String oldItem = command[1];
                String newItem = command[2];

                if (initialList.contains(oldItem)){
                    initialList.set(initialList.indexOf(oldItem), newItem);
                }
            }else if (command[0].equals("Rearrange")){
                String product = command[1];

                if (initialList.contains(product)){
                    initialList.remove(product);
                    initialList.add(product);
                }
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < initialList.size(); i++) {
            System.out.print(initialList.get(i));

            if (i != initialList.size() - 1){
                System.out.print(", ");
            }
        }

    }
}
