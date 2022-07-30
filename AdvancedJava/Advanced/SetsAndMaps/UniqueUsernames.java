package AdvancedJava.Advanced.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cycles =  Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < cycles; i++) {
            String current = scanner.nextLine();
            usernames.add(current);
        }

        for (String s:usernames) {
            System.out.println(s);
        }
    }
}
