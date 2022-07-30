package AdvancedJava.Advanced.GenericArrayCreator.GSwapMethodString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Box> boxList = new ArrayList<>();
        while (number-- > 0){
            Box<String> box = new Box<>(scanner.nextLine());
            boxList.add(box);
        }
        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Box.Swap(indexes[0], indexes[1], boxList);
        boxList.forEach(System.out::println);
    }
}