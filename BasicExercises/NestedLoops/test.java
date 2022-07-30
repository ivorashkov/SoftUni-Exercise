package BasicExercises.NestedLoops;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fNum = Integer.parseInt(scanner.nextLine());
        int secNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= fNum ; i++) {
            for (int j = 2; j <= secNum ; j++) {
                for (int k = 1; k <= thirdNum ; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && j != 4 && j != 6 ){
                        System.out.printf("%d %d %d%n",i,j,k);
                    }
                }

            }

        }
    }
}