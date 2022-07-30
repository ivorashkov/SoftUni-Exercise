package BasicExercises;

import java.util.Scanner;

public class StudyMaterials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packPens = Integer.parseInt(scanner.nextLine());
        int packMarker = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double sumPens = packPens * 5.80;
        double sumMarkers = packMarker * 7.20;
        double sumCleaner = cleaner * 1.20;


        double sumMaterial = sumPens + sumMarkers + sumCleaner;
        double total = sumMaterial - (sumMaterial * percent/100.00);

        System.out.println(total);


    }
}
