package AdvancedJava.Advanced.GenericArrayCreator.GenericCountMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Box<String> boxList = new Box<>();
        while (number-- > 0){
            String boxToAdd = scanner.nextLine();
            boxList.add(boxToAdd);
        }
        String elementToCompare = scanner.nextLine();
        System.out.println(boxList.Compare(elementToCompare));
    }
}
