package BasicExercises.ExamSecond;

import java.util.Scanner;

public class TheMostPowerfulWord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //summ of ASCII
        //a,e,i,o,u,y || A E I O U Y - sum * length
        //otherwise - sum / length - math floor
        //End of words

        int mostPowerfulPoints = 0;
        String mostPowerful = "";
        boolean isSpecial = false;
        String text = scanner.nextLine();

        while (!text.equals("End of words")) {
            int sum = 0;
            for (int i = 0; i < text.length(); i++) {
                char symbol = text.charAt(i);

                sum = sum + symbol;

                if (symbol == text.charAt(0)) {

                    if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o'
                            || symbol == 'u' || symbol == 'y'
                            || symbol == 'A' || symbol == 'E' || symbol == 'I'
                            || symbol == 'O' || symbol == 'U' || symbol == 'Y') {
                        isSpecial = true;
                    } else {
                        isSpecial = false;
                    }
                }

            }

            if (isSpecial) {
                sum = sum * text.length();
            } else {
                sum = Math.abs(sum / text.length());
            }

            if (sum > mostPowerfulPoints) {
                mostPowerfulPoints = sum;
                mostPowerful = text;

            }


            text = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", mostPowerful, mostPowerfulPoints);

    }
}
