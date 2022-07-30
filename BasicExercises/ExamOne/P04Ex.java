package BasicExercises.ExamOne;

import java.util.Scanner;

public class P04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDays = Integer.parseInt(scanner.nextLine());

        double totalLiters = 0;
        double totalDegrees=0;

        for (int i = 0; i < totalDays; i++) {
            double literRakia = Double.parseDouble(scanner.nextLine());
            double degreesOfRakia = Double.parseDouble(scanner.nextLine());

            totalLiters = totalLiters + literRakia;
            totalDegrees = totalDegrees + literRakia * degreesOfRakia;



        }
        totalDegrees = totalDegrees / totalLiters;


        System.out.printf("Liter: %.2f%n",totalLiters);
        System.out.printf("Degrees: %.2f%n", totalDegrees);

        if (totalDegrees < 38){

            System.out.printf("Not good, you should baking!");
        }else if (totalDegrees >=38 && totalDegrees <=42){

            System.out.printf("Super!");
        }else{

            System.out.printf("Dilution with distilled water!");
        }



    }
}
