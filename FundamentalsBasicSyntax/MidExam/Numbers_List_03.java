package FundamentalsBasicSyntax.MidExam;

import java.lang.reflect.Array;
import java.util.*;

public class Numbers_List_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> newList = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        List<Integer> numbers = new ArrayList<>();

        newList.forEach(number->numbers.add(Integer.parseInt((number))));

        int sumOfElements = 0;
        for (int num:numbers) {
            sumOfElements += num;
        }

        double averageNumber =1.0 * sumOfElements / numbers.size();

        int count = 0;
        Collections.sort(numbers);
        Collections.reverse(numbers);
        for (int num:numbers) {

            if (num  > averageNumber && count < 5){
                count++;
                System.out.printf("%d ", num);
            }
        }

        if (count == 0){
            System.out.println("No");
        }

    }
}
