package AdvancedJava.Advanced.ArrayDeque;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> mathElements= new ArrayList<>(Arrays.asList(input.split(" ")));

        ArrayDeque<String> calculations = new ArrayDeque<>();
        calculations.addAll(mathElements);

        while (calculations.size() != 1){
           int firsNum =  Integer.parseInt(calculations.pop());
           String sign = calculations.pop();
           int secondNum =  Integer.parseInt(calculations.pop());

           if (sign.equals("+")){
               int result = firsNum + secondNum;
               calculations.push(String.valueOf(result));

           }else if (sign.equals("-")){
               int result = firsNum - secondNum;
               calculations.push(String.valueOf(result));
           }
        }
        System.out.println(calculations.peek());
    }
}
