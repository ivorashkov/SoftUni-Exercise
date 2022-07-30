package BasicExercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;

        String input = scanner.nextLine();
        int totalSteps = 0;
        while(!input.equals("Going home")){
            int steps = Integer.parseInt(input);
            totalSteps = totalSteps + steps;

            if (totalSteps >= goal){
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Going home")){
            int lastSteps = Integer.parseInt(scanner.nextLine());
            totalSteps = totalSteps + lastSteps;
        }

        if (totalSteps >= goal){
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", totalSteps - goal);
        }else{
            System.out.printf("%d more steps to reach goal.", goal - totalSteps);
        }
    }
}