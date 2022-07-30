package AdvancedJava.Advanced.GenericArrayCreator.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        while (number-- > 0){
            GenericBox<String> box = new GenericBox<>(console.nextLine());
            System.out.println(box);
        }
    }
}
