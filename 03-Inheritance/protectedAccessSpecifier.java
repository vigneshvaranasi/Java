
/* 8. Java program to demonstrate the protected access specifier */

class Parent {
    protected int num = 9;
    protected void parentDisplay() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    public void childDisplay() {
        System.out.println("The number form Parent class is: " + num);
    }
    public void display() {
        parentDisplay();
    }
}
public class protectedAccessSpecifier {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.childDisplay();
        obj.display();
    }
}
