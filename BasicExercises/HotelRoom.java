package BasicExercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceApartment = 0;
        double priceStudio = 0;

        if (month.equals("May") || month.equals("October")) {

            if (nights > 7 && nights < 14) {
                priceStudio = (50 - (50 * 0.05)) * nights;
                priceApartment = 65  * nights;
            } else if (nights > 14) {
                priceStudio = (50 - (50 * 0.30)) * nights;
                priceApartment = (65 - (65 * 0.10)) * nights;
            } else {
                priceStudio = 50 * nights;
                priceApartment = 65 * nights;
            }

        } else if (month.equals("June") || month.equals("September")) {
            if (nights > 14) {
                priceStudio = (75.20 - (75.20 * 0.20)) * nights;
                priceApartment = (68.70 - (68.70 * 0.10)) * nights;
            } else {
                priceStudio = 75.20 * nights;
                priceApartment = 68.70 * nights;
            }

        } else if (month.equals("July") || month.equals("August")) {
                if (nights > 14){
                    priceApartment = (77 - 77 * 0.10) * nights;
                    priceStudio = 76 * nights;
                }else{
                    priceStudio = 76 * nights;
                    priceApartment = 77 * nights;
                }

        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
