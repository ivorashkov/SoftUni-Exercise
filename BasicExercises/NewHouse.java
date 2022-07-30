package BasicExercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double totalprice = 0;

        if (flowers.equals("Roses")){
            if (count > 80){
                price = count * 5.00;
                totalprice = price - price * 0.10;

            }else{

                totalprice = count * 5.00;
            }

        }else if (flowers.equals("Dahlias")){
            if (count > 90){
                price = count * 3.80;
                totalprice = price - price * 0.15;

            }else{
                totalprice = count * 3.80;

            }

        }else if (flowers.equals("Tulips")){
            if (count > 80){
                price = count * 2.80;
                totalprice = price - price * 0.15;
            }else{

                totalprice = count * 2.80;
            }

        }else if (flowers.equals("Narcissus")){
            if(count < 120){
                price = count * 3.00;
                totalprice = price + price * 0.15;
            }else{
                totalprice = count * 3.00;
            }

        }else if (flowers.equals("Gladiolus")){
            if (count < 80){
                price = count * 2.50;
                totalprice = price + price * 0.20;
            }else {

                totalprice = count * 2.50;
            }

        }
        if (budget < totalprice){

            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(totalprice - budget));

        }else{

            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count,flowers,Math.abs(budget - totalprice));
        }
    }
}
