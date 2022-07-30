package FundamentalsBasicSyntax.FinalExam;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")){
            String[] commands = input.split("\\s+");
            String command = commands[0];

            if (command.equals("TakeOdd")){
                StringBuilder currentString= new StringBuilder();
                for (int i = 1; i < stringBuilder.length() ; i+=2) {
                    char currentChar = stringBuilder.charAt(i);
                    currentString.append(currentChar);
                }
                stringBuilder = currentString;
                System.out.println(currentString);

            }else if (command.equals("Cut")){
                int index =  Integer.parseInt(commands[1]);
                int length =  Integer.parseInt(commands[2]);

                stringBuilder.replace(index,index+length,"");
                System.out.println(stringBuilder);

            }else if (command.equals("Substitute")){
                String substring = commands[1];
                String substitute = commands[2];

                if (stringBuilder.indexOf(substring)!= -1){
                   String currentString = stringBuilder.toString();
                   stringBuilder = new StringBuilder(currentString.replace(substring, substitute));
                    System.out.println(stringBuilder);
                }else{
                    System.out.println("Nothing to replace!");
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + stringBuilder);

    }
}
