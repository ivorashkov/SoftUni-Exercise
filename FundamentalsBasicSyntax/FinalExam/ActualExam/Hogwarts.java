package FundamentalsBasicSyntax.FinalExam.ActualExam;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String spell = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Abracadabra")) {
            String[] coms = input.split("\\s");
            String command = coms[0];

            if (command.equals("Abjuration")) {
                spell = spell.toUpperCase();
                System.out.println(spell);

            } else if (command.equals("Necromancy")) {
                spell = spell.toLowerCase();
                System.out.println(spell);

            } else if (command.equals("Illusion")) {
                int index = Integer.parseInt(coms[1]);
                String character = coms[2];


                if (index < 0 || index > spell.length() - 1) {
                    System.out.println("The spell was too weak.");
                } else {
                    String firstPart = spell.substring(0,index);
                    String secondPart = spell.substring(index + character.length());
                    spell = firstPart + character + secondPart;
                    System.out.println("Done!");
                }

            } else if (command.equals("Divination")) {
                String firstSubstring = coms[1];
                String secondSubstring = coms[2];

                if (spell.indexOf(firstSubstring) != -1) {
                    spell = spell.replace(firstSubstring, secondSubstring);
                    System.out.println(spell);
                }

            } else if (command.equals("Alteration")) {
                String substring = coms[1];

                if (spell.indexOf(substring) != -1) {
                   spell =  spell.replace(substring, "");
                    System.out.println(spell);
                }

            } else {
                System.out.println("The spell did not work!");
            }

            input = scanner.nextLine();
        }

    }

}
