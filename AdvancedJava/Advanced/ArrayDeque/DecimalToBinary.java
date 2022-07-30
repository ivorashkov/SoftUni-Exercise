package AdvancedJava.Advanced.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal =  Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> resultInBinary = new ArrayDeque<>();
        while (decimal != 0){
            resultInBinary.push(decimal % 2);
            decimal /= 2;
        }

        if (resultInBinary.size()!=0){
            for (Integer integer : resultInBinary) {
                System.out.print(integer);
            }
        }else{
            System.out.println("0");
        }

    }
}
/////////////