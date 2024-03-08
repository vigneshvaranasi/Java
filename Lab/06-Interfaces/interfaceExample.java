interface Shape{
    double area();
    double perimeter();
}
class Circle implements Shape{
    double radius;
    Circle(double r){
        radius = r;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
} 
class Rectangle implements Shape{
    double length, breadth;
    Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 * (length + breadth);
    }
}

public class interfaceExample {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Perimeter of Circle: " + c.perimeter());
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Perimeter of Rectangle: " + r.perimeter());
    }
}
