import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGrade() { return grade; }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", grade=" + grade + '}';
    }
}

class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

public class ExternalComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vignesh", 22, 85.5));
        students.add(new Student("Eswar", 20, 90.0));
        students.add(new Student("Fakruddin", 21, 87.0));

        System.out.println("Before sorting by age:");
        System.out.println(students);

        // Sort by age using StudentAgeComparator
        Collections.sort(students, new StudentAgeComparator());

        System.out.println("After sorting by age:");
        System.out.println(students);
    }
}
