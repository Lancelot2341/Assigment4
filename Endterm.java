import java.lang.Math;

// Interface for a generic shape
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Base class for all shapes
abstract class AbstractShape implements Shape {
    // No need to implement Shape interface methods here
}

// Concrete class for Circle
class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class for Rectangle
class Rectangle extends AbstractShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Creating objects of shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculating and displaying area and perimeter
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
    }
}

