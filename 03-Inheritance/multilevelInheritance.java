
/* 2. Java program to implement multi-level inheritance */

class Parent {
    public void parentDisplay() {
        System.out.println("Parent class");
    }
}
class Child1 extends Parent{
    public void child1Display() {
        System.out.println("Child-1 class");
    }
}
class Child2 extends Child1{
    public void child2Display() {
        System.out.println("Child-2 class");
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.parentDisplay();
        obj.child1Display();
        obj.child2Display();
    }  
}
