
/* 6. Java program to create an employee class by inheriting Person class */

class Person {
    private String name;
    private int age;
    
    public Person(String name_, int age_) {
        name= name_;
        age = age_;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    private String employeeId;
    private int salary;    
    public Employee(String name, int age, String employeeId_, int salary_)
    {
        super(name, age); 
        employeeId = employeeId_;
        salary = salary_;
    }
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
public class employeeInheritance {
    public static void main(String[] args) {
        Employee employee = new Employee("Vignesh Varanasi", 19, "9", 50000);
        employee.display();
    }
}
