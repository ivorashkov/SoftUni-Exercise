package FundamentalsBasicSyntax.RegularExpressions;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
       // List<String> listNames = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")))
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
