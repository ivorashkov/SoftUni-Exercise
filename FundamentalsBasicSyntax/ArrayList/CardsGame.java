package FundamentalsBasicSyntax.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> firstDeckString= new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        List<String> secondDeckString= new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        List<Integer> firstDeckNum = new ArrayList<>(firstDeckString.size());
        List<Integer> secondDeckNum = new ArrayList<>(secondDeckString.size());

        firstDeckString.forEach(num->firstDeckNum.add(Integer.parseInt(num)));
        secondDeckString.forEach(num->secondDeckNum.add(Integer.parseInt(num)));
        int iterrator = firstDeckNum.size();
        int i = 0;
        while(i < iterrator) {

            if (firstDeckNum.size() == 0 || secondDeckNum.size() == 0){
                int sum = 0;
                if (firstDeckNum.size() != 0){
                    for (int num:firstDeckNum) {
                        sum += num;
                    }
                    System.out.printf("First player wins! Sum: %d", sum);
                }else{
                    for (int num:secondDeckNum) {
                        sum += num;
                    }
                    System.out.printf("Second player wins! Sum: %d", sum);
                }
                break;
            }
            if (firstDeckNum.get(i) > secondDeckNum.get(i)){
                firstDeckNum.add(firstDeckNum.get(i));
                firstDeckNum.add(secondDeckNum.get(i));
                secondDeckNum.remove(i);
                firstDeckNum.remove(i);
            }else if (secondDeckNum.get(i) > firstDeckNum.get(i)){
                secondDeckNum.add(secondDeckNum.get(i));
                secondDeckNum.add(firstDeckNum.get(i));
                secondDeckNum.remove(i);
                firstDeckNum.remove(i);
            }else if (firstDeckNum.get(i).equals(secondDeckNum.get(i))){
                firstDeckNum.remove(i);
                secondDeckNum.remove(i);
            }
        }

    }
}
