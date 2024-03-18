
/* 3. Java program to implement hierarchical inheritance */

class Parent {
    public void parentDisplay() {
        System.out.println("Parent class");
    }
}
class Child1 extends Parent{
    public void childDisplay() {
        System.out.println("Child-1 class");
    }
}
class Child2 extends Parent{
    public void childDisplay() {
        System.out.println("Child-2 class");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        obj1.parentDisplay();
        obj1.childDisplay();
        obj2.parentDisplay();
        obj2.childDisplay();
    }    
    
}
