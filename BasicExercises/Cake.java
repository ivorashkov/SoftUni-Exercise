package BasicExercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double  l= Double.parseDouble(scanner.nextLine());

        double cake = w * l;
        double currentPiece=0;

        String input = scanner.nextLine();
        while(!input.equals("STOP")){
             currentPiece = Double.parseDouble(input);

            if (cake > currentPiece){
                cake -= currentPiece;

            }else {
                currentPiece -= cake;
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("STOP")){
            System.out.printf("%.0f pieces are left.%n", cake);
        }else{
            System.out.printf("No more cake left! You need %.0f pieces more.", currentPiece);
        }
    }
}
