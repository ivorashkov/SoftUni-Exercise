package AdvancedJava.Advanced.SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input =  Integer.parseInt(scanner.nextLine());
        Map<String,Double> infoMap = new TreeMap<>();
        for (int i = 0; i < input; i++) {
            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split("\\s+");

            double count = 0.0;
            for (String g:grades) {
                double grade =  Double.parseDouble(g);
                count += grade;
            }

            infoMap.put(name,count/ grades.length);
        }


        for (Map.Entry<String,Double>entry: infoMap.entrySet()) {
            System.out.println(entry.getKey() + " is graduated with " + entry.getValue());

        }
    }
}
