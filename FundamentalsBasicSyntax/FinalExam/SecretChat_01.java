package FundamentalsBasicSyntax.FinalExam;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Reveal")){
            String[] commands = input.split(":\\|:");
            String command = commands[0];

            if (command.equals("InsertSpace")){
                int index =  Integer.parseInt(commands[1]);
                stringBuilder.insert(index," ");
                System.out.println(stringBuilder);

            }else if (command.equals("Reverse")){
                String substr = commands[1];

               // int indexOf = stringBuilder.indexOf(substr);
                if (stringBuilder.indexOf(substr) != -1){
                    stringBuilder.delete(stringBuilder.indexOf(substr),stringBuilder.indexOf(substr) + substr.length());
                    StringBuilder reversed = new StringBuilder(substr);
                    reversed.reverse();
                    stringBuilder.append(reversed);
                    System.out.println(stringBuilder);

                }else{
                    System.out.println("error");
                }


            }else if (command.equals("ChangeAll")){
                String substr = commands[1];
                String replacement = commands[2];

                String text = stringBuilder.toString();
                stringBuilder = new StringBuilder(text.replace(substr, replacement));
                System.out.println(stringBuilder);

            }

            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",stringBuilder);
    }
}
