package AdvancedJava.OOP.Polymorphism.Shapes;

public class Rectangle extends Shape {
    //забраняваме промяна на обекта след инициализацията от конструктора
    //за да може методите винаги да са верни
    private final Double height;
    private final Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        //щом веднъж е изчислено се пази и се връща готовия резултат
        if (perimeter == null) {
            perimeter = 2 * height + 2 * width;
        }

        return perimeter;
    }

    @Override
    public Double calculateArea() {
        if (area == null) {
            area = height * width;
        }

        return area;
    }
}
