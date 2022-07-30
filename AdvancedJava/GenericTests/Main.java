package AdvancedJava.GenericTests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Mammal> mammals = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            String name = tokens[1];
            int age =  Integer.parseInt(tokens[2]);
            double weight =  Double.parseDouble(tokens[3]);

            if ("Person".equals(type)){
                String workPlace = tokens[4];

            }else if ("Dog".equals(type)){
                String breed = tokens[4];


            }
            input = scanner.nextLine();
        }
    }

    <T> void listPrinter(List<T> list){
        for (T element: list) {
//            GenericMethodUtils<Mammal> g = new GenericMethodUtils<>(element);
//            System.out.println();
        }
    }
}
