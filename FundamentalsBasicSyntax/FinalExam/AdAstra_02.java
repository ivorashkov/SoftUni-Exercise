package FundamentalsBasicSyntax.FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    static class Product{
        String name;
        String date;
        int calories;

        public Product(String name, String date, int calories) {
            this.name = name;
            this.date = date;
            this.calories = calories;
        }

        public String getName() {
            return name;
        }

        public String getDate() {
            return date;
        }

        public int getCalories() {
            return calories;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("([|#])(?<item>[A-Za-z ]+)\\1(?<date>(?<day>[0-9]{2})\\/(?<month>[0-9]{2})\\/(?<year>[0-9]{2}))\\1(?<calories>[0-9]{1,4}|10000)\\1");
        Matcher matcher = pattern.matcher(text);

        List<Product> products = new ArrayList<>();
        int totalCalories = 0;
        while (matcher.find()){
            int calories =  Integer.parseInt((matcher.group("calories")));
            totalCalories += calories;
            products.add(new Product(matcher.group("item"), matcher.group("date"), calories));
        }

        System.out.printf("You have food to last you for: %d days!%n",totalCalories / 2000);
        for (Product product:products) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",product.getName(),product.getDate(),product.getCalories());
        }
    }
}
