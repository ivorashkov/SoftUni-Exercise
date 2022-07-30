package FundamentalsBasicSyntax.MidExam.ActualExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shelfWithBooks = new ArrayList<>(Arrays.asList(scanner.nextLine().split("&")));

        String input = scanner.nextLine();

        while (!input.equals("Done")){
            String[] command = input.split("\\s+\\|+\\s+");

            if (command[0].equals("Add Book")){
                String nameOfBook = command[1];
                if (!shelfWithBooks.contains(nameOfBook)){
                    shelfWithBooks.add(0,nameOfBook);
                }
            }else if (command[0].equals("Take Book")){
                String nameOfBook = command[1];
                if (shelfWithBooks.contains(nameOfBook)){
                    shelfWithBooks.remove(nameOfBook);
                }
            }else if (command[0].equals("Swap Books")){
                String nameOfBook1 = command[1];
                String nameOfBook2 = command[2];
                if (shelfWithBooks.contains(nameOfBook1) && shelfWithBooks.contains(nameOfBook2)){
                    int indexOfFirst = shelfWithBooks.indexOf(nameOfBook1);
                    int indexOfSecond = shelfWithBooks.indexOf(nameOfBook2);
                    String nameOfBook = nameOfBook1;
                    shelfWithBooks.set(indexOfFirst,nameOfBook2);
                    shelfWithBooks.set(indexOfSecond,nameOfBook);

                }
            }else if (command[0].equals("Insert Book")){
                String nameOfBook = command[1];
                if (!shelfWithBooks.contains(nameOfBook)){
                    shelfWithBooks.add(nameOfBook);
                }
            }else if (command[0].equals("Check Book")){
                int index =  Integer.parseInt(command[1]);

                if (!(index<0 || index > shelfWithBooks.size()-1)){
                    System.out.println(shelfWithBooks.get(index));
                }

            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < shelfWithBooks.size(); i++) {
            System.out.print(shelfWithBooks.get(i));

            if (i!=shelfWithBooks.size()-1){
                System.out.print(", ");
            }
        }
    }
}
