package FundamentalsBasicSyntax.RegularExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = new ArrayList<>();
        double price = 0;

        String input = scanner.nextLine();
        while (!input.equals("Purchase")){
            Pattern pattern = Pattern.compile(">>(?<item>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                double currentPrice =  Double.parseDouble(matcher.group("price"));
                int quantity =  Integer.parseInt(matcher.group("quantity"));
                price += 1.0 * currentPrice * quantity;
                items.add(matcher.group("item"));
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String s:items) {
            System.out.println(s);
        }

        System.out.printf("Total money spend: %.2f",price);


    }
}
