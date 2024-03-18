
class Shape {
    public double calculateArea() {
        return 0;
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class shapeMain {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(5, 10);
        Shape s3 = new Triangle(5, 10);
        System.out.println("Area of Circle: " + s1.calculateArea());
        System.out.println("Area of Rectangle: " + s2.calculateArea());
        System.out.println("Area of Triangle: " + s3.calculateArea());
    }
}
