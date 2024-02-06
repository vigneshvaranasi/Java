
/* 1. Java program to implement single inheritance */

class Parent {
    public void parentDisplay() {
        System.out.println("Parent class");
    }
}
class Child extends Parent{
    public void childDisplay() {
        System.out.println("Child class");
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.parentDisplay();
        obj.childDisplay();
    }    
}
