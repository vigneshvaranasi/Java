import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vignesh", 22));
        students.add(new Student("Eswar", 20));
        students.add(new Student("Fakruddin", 21));

        System.out.println("Original List:");
        System.out.println(students);

        // Uncomment one of the following sections to apply a specific sorting method

        // 1. Using External Comparator Class (Uncomment to use)
        Collections.sort(students, new StudentAgeComparator());

        // 2. Using Anonymous Inner Class (Uncomment to use)
        // Collections.sort(students, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2) {
        //         return Integer.compare(s1.getAge(), s2.getAge());
        //     }
        // });

        // 3. Using Lambda Expressions (Uncomment to use)
        // students.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        // 4. Using Comparator.comparing() (Uncomment to use)
        // students.sort(Comparator.comparing(Student::getAge));

        // 5. Using Method References (Uncomment to use)
        // students.sort(Comparator.comparingInt(Student::getAge));

        System.out.println("Sorted List:");
        System.out.println(students);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", age=" + age + "}";
    }
}

// External Comparator Class for sorting by age
class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
