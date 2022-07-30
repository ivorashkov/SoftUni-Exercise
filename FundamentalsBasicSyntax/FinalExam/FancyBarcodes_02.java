package FundamentalsBasicSyntax.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern validBarcodePattern = Pattern.compile("@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+");

        int count =  Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            Matcher validMatcher = validBarcodePattern.matcher(input);
            StringBuilder stringBuilder = new StringBuilder();
            if (validMatcher.find()){
                Pattern digits = Pattern.compile("\\d+");
                Matcher digitMatcher = digits.matcher(validMatcher.group("barcode"));

                while (digitMatcher.find()){
                    stringBuilder = stringBuilder.append(digitMatcher.group());
                }
                if (stringBuilder.length() != 0){
                    System.out.printf("Product group: %s%n",stringBuilder);
                }else{
                    System.out.printf("Product group: 00%n");
                }

            }else{
                System.out.printf("Invalid barcode%n");
            }

        }

    }

}
