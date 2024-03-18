
/* 5. Java program to call the method with the same name using super keyword */

class Parent {
    public void display() {
        System.out.println("Parent's display() method");
    }
}

class Child extends Parent {
    public void display() {
        super.display(); 
        System.out.println("Child's display() method");
    }
}
public class methodCallWithSuper {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
