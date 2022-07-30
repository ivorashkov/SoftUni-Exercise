package AdvancedJava.OOP.Abstraction.PointInRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = createRectangle(scanner);
        int lines = Integer.parseInt(scanner.nextLine());

        while (lines-- > 0){
            String[] coords = scanner.nextLine().split("\\s+");
            String x = coords[0];
            String y = coords[1];
            Point currentPoint = createPoint(x,y);
            System.out.println(rectangle.contains(currentPoint));
        }

    }


    private static Rectangle createRectangle(Scanner scanner) {
        String[] coordsInput = scanner.nextLine().split("\\s+");
        String bottomLeftX =coordsInput[0];
        String bottomLeftY = coordsInput[1];
        String topRightX = coordsInput[2];
        String topRightY = coordsInput[3];

        return new Rectangle(createPoint(bottomLeftX,bottomLeftY),createPoint(topRightX,topRightY));
    }

    private static Point createPoint(String x, String y){
        int x1 = Integer.parseInt(x);
        int y1 =  Integer.parseInt(y);
        return new Point(x1,y1);
    }

}
