package FundamentalsBasicSyntax.FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] commands = input.split("\\|");
            String command = commands[0];

            if (command.equals("Move")) {
                int number = Integer.parseInt(commands[1]);

                String firstPart = encryptedMessage.substring(0,number);
                String secondPart = encryptedMessage.substring(number);
                encryptedMessage = secondPart.concat(firstPart);
                //encryptedMessage = secondPart + firstPart


            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(commands[1]);
                String value = commands[2];

                String firstPart = encryptedMessage.substring(0,index);
                String secondPart = encryptedMessage.substring(index);
                encryptedMessage = firstPart.concat(value).concat(secondPart);
                //encryptedMessage = firstPart + value + secondPart

            } else if (command.equals("ChangeAll")) {
                String oldValue = commands[1];
                String newValue = commands[2];

               encryptedMessage.replace(oldValue,newValue);

            }

            input = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + encryptedMessage);
    }
}