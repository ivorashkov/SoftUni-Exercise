package BasicExercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double totalGpu = gpu * 250;
        double totalCpu = (totalGpu * 0.35) * cpu;
        double totalRam = (totalGpu * 0.10) * ram;

        double totalSum = totalGpu +  totalCpu + totalRam;

        if (gpu > cpu){
            totalSum = totalSum - totalSum * 0.15;
        }

        if (budget >= totalSum){

            System.out.printf("You have %.2f leva left!", budget - totalSum);
        }else{

            System.out.printf("Not enough money! You need %.2f leva more!",totalSum - budget);
        }
    }



}
