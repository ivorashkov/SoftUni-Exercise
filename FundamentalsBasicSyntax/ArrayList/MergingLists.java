package FundamentalsBasicSyntax.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = stringToIntArrayList(scanner.nextLine());
        List<Integer> secondList = stringToIntArrayList(scanner.nextLine());
        List<Integer> thirdList = mergeTwoLists(firstList, secondList);

        for (int n: thirdList) {
            System.out.print(n + " ");
        }
    }

    private static List<Integer> mergeTwoLists(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> thirdList = new ArrayList<>();
        int i = 0;
        while (i < firstList.size() || i < secondList.size()){
            if (i < firstList.size()){
                thirdList.add(firstList.get(i));

            }
            if (i < secondList.size()){
                thirdList.add(secondList.get(i));
            }
            i++;
        }
        return thirdList;
    }

    private static List<Integer> stringToIntArrayList(String input) {
        String[] stringNumbers = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : stringNumbers) {
            numbers.add(Integer.parseInt(s));//insert from Array to List
        }
        return numbers;
    }


}
