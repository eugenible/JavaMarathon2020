package day9.Task2;

public class Rectangle extends Figure {
    private double length, width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double area() {
        return (length * width);
    }

    public double perimeter() {
        return (2 * length + 2 * width);
    }
}
