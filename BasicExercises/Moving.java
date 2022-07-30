package BasicExercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int availableSpace = w * l * h;
        int boxCount = 0;
        String input = scanner.nextLine();

        while (!input.equals("Done")){
            boxCount = Integer.parseInt(input);

            if (boxCount < availableSpace){
                availableSpace -= boxCount;
            }else{
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("Done")){
            System.out.printf("%d Cubic meters left.", availableSpace);
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.",boxCount - availableSpace);
        }
    }
}
