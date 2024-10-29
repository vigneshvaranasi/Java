import java.util.*;

class Student {
    private String rollNo;
    private String name;
    private String gender;
    private double cgpa;
    private double sgpa;

    public Student(String rollNo, String name, String gender, double cgpa, double sgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.cgpa = cgpa;
        this.sgpa = sgpa;
    }

    public String getRollNo() { return rollNo; }
    public double getCgpa() { return cgpa; }
    public double getSgpa() { return sgpa; }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + gender + " " + cgpa + " " + sgpa;
    }
}

class MainClass {
    // Comparator for sorting by roll number
    static Comparator<Student> rollnoComparator = (s1, s2) -> s1.getRollNo().compareTo(s2.getRollNo());

    // Comparator for sorting by CGPA and then by SGPA as a tie-breaker
    static Comparator<Student> CGPAComparator = (s1, s2) -> {
        int cgpaComparison = Double.compare(s2.getCgpa(), s1.getCgpa());
        return (cgpaComparison != 0) ? cgpaComparison : Double.compare(s2.getSgpa(), s1.getSgpa());
    };

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
            new Student("18501A0501", "Ramesh Kumar", "Male", 8.56, 9.01),
            new Student("18501A0502", "Arun Prasad", "Male", 8.79, 8.96),
            new Student("18501A0510", "Sarika", "Female", 8.95, 9.12),
            new Student("18501A0504", "Ashwini", "Female", 9.32, 8.88),
            new Student("18501A0508", "Hari Babu", "Male", 9.12, 8.78),
            new Student("18501A0503", "Radhika", "Female", 9.12, 8.76),
            new Student("18501A0507", "Hari Kiran", "Male", 9.32, 9.11),
            new Student("18501A0506", "William", "Male", 8.96, 9.13),
            new Student("18501A0509", "Madhulika", "Female", 8.97, 9.01),
            new Student("18501A0505", "Harika", "Female", 8.65, 8.97)
        ));

        // Sort and print by roll number
        Collections.sort(students, rollnoComparator);
        System.out.println("Sorted by Roll Number:");
        students.forEach(System.out::println);

        // Sort and print by CGPA and SGPA
        Collections.sort(students, CGPAComparator);
        System.out.println("\nSorted by CGPA (and SGPA if CGPA is equal):");
        students.forEach(System.out::println);
    }
}
