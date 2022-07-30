package BasicExercises.ExamExcersises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student =0;
        int standard =0;
        int kids =0;
        int counter = 0;

        String movie = scanner.nextLine();
        while(!movie.equals("Finish")){

            int freeSeats = Integer.parseInt(scanner.nextLine());
            String type = scanner.nextLine();
            int currentCounter = 0;


            while (!type.equals("End")){

                currentCounter++;
                counter++;

                if (type.equals("student")){
                    student++;

                }else if (type.equals("standard")){
                    standard++;

                }else if (type.equals("kid")){
                    kids++;
                }

                if (currentCounter == freeSeats){
                    break;
                }

                type = scanner.nextLine();

            }

            System.out.printf("%s - %.2f%% full.%n", movie, currentCounter * 1.00 / freeSeats * 100);
            movie = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d%n",counter);
        System.out.printf("%.2f%% student tickets.%n",student * 1.00 / counter * 100);
        System.out.printf("%.2f%% standard tickets.%n",standard * 1.00 / counter * 100);
        System.out.printf("%.2f%% kids tickets.",kids * 1.00 / counter * 100);
    }
}
