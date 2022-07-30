package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FoodFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //representing vowels and consonants
        ArrayDeque<Character> vowels = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(c -> vowels.offer(c.charAt(0)));

        ArrayDeque<Character> consonants = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(c-> consonants.push(c.charAt(0)));

        String[] words = new String[]{"pear", "flour", "pork", "olive"};
        String[] found = new String[]{"****", "*****","****", "*****"};

        while (!consonants.isEmpty()){
            char currentVowel = vowels.poll();
            char currentConsonant = consonants.pop();

            for (int index = 0; index < words.length; index++) {
                String currentWord = words[index];
                int indexOfVowel = currentWord.indexOf(currentVowel);
                int indexOfCons = currentWord.indexOf(currentConsonant);

                if (indexOfVowel >= 0){
                    found[index] = found[index].substring(0,indexOfVowel) + currentVowel + found[index]
                            .substring(indexOfVowel + 1);
                }
                if (indexOfCons >= 0){
                    found[index] = found[index].substring(0,indexOfCons) + currentConsonant +
                            found[index].substring(indexOfCons + 1);
                }
                vowels.offer(currentVowel);
            }
        }
        List<String> output = Arrays.stream(found).filter(w->!w.contains("*")).collect(Collectors.toList());

        System.out.printf("Words found: %d%n",output.size());
        output.forEach(System.out::println);
    }
}
