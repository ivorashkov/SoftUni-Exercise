package FundamentalsBasicSyntax;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessingTest {
    public static void main(String[] args) {
        String initialString = "We1Are2Currently3Having4Some5String6With7Information8.";
        String word = "Currently";

        String firstPart = initialString.substring(0, initialString.indexOf(word));
        System.out.println("firstPart ->" + firstPart);
        String firstPart1 = initialString.substring(0, initialString.indexOf(word) + word.length());
        System.out.println("firstPart1 ->" + firstPart1);

        String secondPart = initialString.substring(initialString.indexOf(word));
        System.out.println("secondPart ->" + secondPart);
        String secondPart1 = initialString.substring(initialString.indexOf(word) + word.length());
        System.out.println("secondPart1 ->" + secondPart1);

        int indexOf = initialString.indexOf(word);
        System.out.println("indexOf -> " + indexOf);

        //todo Delete a word from string
        StringBuilder del = new StringBuilder(initialString);
        del.delete(indexOf, indexOf + word.length());
        System.out.println("del - > " + del);

        initialString = initialString.replace("Having", "");
        System.out.println("deleteWithString -> " + initialString);

        del.insert(10, "HOWAREYOUHOWAREYOU");
        System.out.println("insertHOWAREYOU " + del);

        initialString = del.toString().replace("a", "777");
        System.out.println("replacedAwith777 -> " + initialString);

        del = new StringBuilder();
        //reverse normalString
        for (int i = initialString.length() - 1; i >= 0; i--) {
            del.append(initialString.charAt(i));
        }
        System.out.println("charsAppendedReverced ->" + del);

        //reverse stringBuilder
        del.reverse();
        System.out.println("reverseMethod ->" + del);

        initialString = initialString.replaceAll("\\d+", "||");
        System.out.println("replaceAll ->" + initialString);

        //замества всички срещания
        initialString = initialString.replace("|","+");
        System.out.println("replace -> " + initialString);

        initialString = initialString.toLowerCase();
        System.out.println("toLowerCase -> " + initialString);

        initialString = initialString.toUpperCase();
        System.out.println("toUpperCase -> " + initialString);

        //replace 1 word in string by changing the letters
        String word2 = "HOWAREYOU";
        del = new StringBuilder(initialString);
        int startIndex = del.indexOf(word2);
        del.replace(startIndex,startIndex + word2.length(),word2.toLowerCase());
        System.out.println("toUpper -> " + del);

        del = new StringBuilder();
        for (int i = 0; i < initialString.length(); i+=2) {
            del.append(initialString.charAt(i));
        }
        System.out.println("evenCharsOnly -> " + del);

        del = new StringBuilder();
        for (int i = 1; i <= initialString.length() - 1 ; i+=2) {
            del.append(initialString.charAt(i));
        }
        System.out.println("oddCharsOnly -> " + del);

        //todo patterns -> summing all digits in String
        initialString = "We10Are21Currently32Having4Some5String6With7Information8.";
        Pattern digits = Pattern.compile("\\d");
        Matcher matcher = digits.matcher(initialString);
        int sumOfDigits = 0;
        while (matcher.find()){
            int currentDigit =  Integer.parseInt(matcher.group());
            System.out.print(currentDigit + " ");
            sumOfDigits += currentDigit;
        }
        System.out.println();
        System.out.println(sumOfDigits);

        //todo pattern -> summing all elements' ASCII values
        initialString = "We10Are21Current_/*$";
        Pattern charPattern = Pattern.compile("\\w");//only alphabet chars
        Matcher charMatcher = charPattern.matcher(initialString);
        int sumOfChars = 0;
        while (charMatcher.find()){
            String currentChar = charMatcher.group();
            char current = currentChar.charAt(0); // taking out every available char
            int current1 = currentChar.charAt(0); // ASCII value for each available char
            System.out.print(current + " ");
            sumOfChars += current1;
        }
        System.out.println();
        System.out.println(sumOfChars);


    }
}
