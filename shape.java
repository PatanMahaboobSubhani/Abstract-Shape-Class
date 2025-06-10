//1. Abstract Class: Shape
public abstract class Shape {
    // Abstract method
    public abstract double calculateArea();
}

//2. Subclass: Circle
public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

//3. Subclass: Rectangle
java
Copy
Edit
public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

//4. Test Class (Main)
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7.0);
        Shape rectangle = new Rectangle(5.0, 10.0);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
