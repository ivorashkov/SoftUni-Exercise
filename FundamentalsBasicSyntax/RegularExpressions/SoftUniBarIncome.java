package FundamentalsBasicSyntax.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalIncome = 0;
        while (!input.equals("end of shift")){
            Pattern valid = Pattern.compile("%(?<consumer>[A-Z][a-z]+)%[^|$%]*<(?<product>\\w+)>[^|$%]*\\|(?<count>\\d+)\\|[^|$%\\d]*(?<price>\\d+.?\\d*)\\$");
            Matcher matcher = valid.matcher(input);

            if (matcher.find()){
                String name = matcher.group("consumer");
                String product = matcher.group("product");
                int quantity =  Integer.parseInt(matcher.group("count"));
                double price =  Double.parseDouble(matcher.group("price"));
                double result = price * quantity;
                totalIncome += result;

                System.out.printf("%s: %s - %.2f%n",name,product,result);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }
}
