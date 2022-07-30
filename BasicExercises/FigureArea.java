package BasicExercises;

import java.util.Scanner;

public class FigureArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double area = 0;

        if (figure.equals("square")){

            double l = Double.parseDouble(scanner.nextLine());

            area = l * l;


        }else if(figure.equals("rectangle")){
            double w = Double.parseDouble(scanner.nextLine());
            double l = Double.parseDouble(scanner.nextLine());

            area = w * l;

        }else if(figure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());

            area = Math.PI * r * r;

        }else if(figure.equals("triangle")){
            double l = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = (l * h)/2;

        }

        System.out.printf("%.3f", area);
    }

}
