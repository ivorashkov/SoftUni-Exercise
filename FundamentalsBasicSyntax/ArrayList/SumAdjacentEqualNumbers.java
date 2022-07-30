package FundamentalsBasicSyntax.ArrayList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringNumbers = input.split("\\s+");
        List<Double> numbers = new ArrayList<>();

        for (String s : stringNumbers) {
            numbers.add(Double.parseDouble(s));//insert from Array to List
        }

        //създаваме нов лист, който приема промените по стария лист на метод sumAdjacentEqualNumbers
        List<Double> newNumbers = sumAdjacentEqualNumbers(numbers);
        while (newNumbers.size() != numbers.size()){ // проверяваме дали има някаква промяна
            numbers = newNumbers; // приемаме новите стойности
            newNumbers = sumAdjacentEqualNumbers(numbers); // извикваме отново метод за промяна
        }

        for (double number:numbers) {
            System.out.print(new DecimalFormat("0.# ").format(number));
        }
    }

    private static List<Double> sumAdjacentEqualNumbers(List<Double> numbers) {
        List<Double> newNumbers = new ArrayList<>();//нов лист
        int i = 0;//индекс
        while (i < numbers.size()) { //обхождаме по дължина
            //проверка за краен елемент/ текущ равен ли е на следващия
            if (i < numbers.size() - 1 && Double.compare(numbers.get(i),numbers.get(i + 1)) == 0) {
                newNumbers.add(numbers.get(i) + numbers.get(i + 1));
                i +=2;
            }else{
                newNumbers.add(numbers.get(i));
                i++;
            }

        }
        return newNumbers;
    }
}