package BasicExercises;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;
        boolean weekend = day.equals("Sunday") || day.equals("Saturday");

        boolean isFruit = fruit.equals("banana") ||
                            fruit.equals("apple") ||
                            fruit.equals("orange") ||
                            fruit.equals("grapefruit") ||
                            fruit.equals("kiwi") ||
                            fruit.equals("pineapple") ||
                            fruit.equals("grapes");

        if (isFruit){
        if (!weekend){
            if (fruit.equals("banana")){
                totalPrice = quantity * 2.50;
            }else if(fruit.equals("apple")){
                totalPrice = quantity * 1.20;
            }else if(fruit.equals("orange")){
                totalPrice = quantity * 0.85;
            }else if (fruit.equals("grapefruit")){
                totalPrice = quantity * 1.45;
            }else if (fruit.equals("kiwi")){
                totalPrice = quantity * 2.70;
            }else if (fruit.equals("pineapple")){
                totalPrice = quantity * 5.50;
            }else if(fruit.equals("grapes")){
                totalPrice = quantity * 3.85;
            }
        }else{
            if (fruit.equals("banana")){
                totalPrice = quantity * 2.70;
            }else if(fruit.equals("apple")){
                totalPrice = quantity * 1.25;
            }else if(fruit.equals("orange")){
                totalPrice = quantity * 0.90;
            }else if (fruit.equals("grapefruit")){
                totalPrice = quantity * 1.60;
            }else if (fruit.equals("kiwi")){
                totalPrice = quantity * 3.00;
            }else if (fruit.equals("pineapple")){
                totalPrice = quantity * 5.60;
            }else if(fruit.equals("grapes")){
                totalPrice = quantity * 4.20;
            }
        }
            System.out.printf("%.2f", totalPrice);
        }else{
            System.out.println("error");
        }


    }
}
