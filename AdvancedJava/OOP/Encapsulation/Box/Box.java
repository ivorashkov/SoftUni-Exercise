package AdvancedJava.OOP.Encapsulation.Box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double calculateSurfaceArea() {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (length * height) + 2 * (width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }

    private void checkForNotValidArgument(double argument, String name){
        if (argument <= 0){
            throw new IllegalArgumentException(name + " cannot be negative.");
        }
    }

    private void setLength(double length) {
        checkForNotValidArgument(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        checkForNotValidArgument(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        checkForNotValidArgument(height, "Height");
        this.height = height;
    }
}
