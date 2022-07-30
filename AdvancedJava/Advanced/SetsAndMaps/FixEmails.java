package AdvancedJava.Advanced.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> emails = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String email = scanner.nextLine();
            String domain = email.substring(email.lastIndexOf(".") + 1);
            if (!("us".equals(domain) || "uk".equals(domain) || "com".equals(domain))) {
                emails.put(input, email);
            }
            input = scanner.nextLine();
        }
        emails.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
