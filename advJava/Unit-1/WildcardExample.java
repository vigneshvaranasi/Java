import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    // Method with Unbounded Wildcards
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method with Upper Bounded Wildcards
    public static void printNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            System.out.print(num + " ");
            sum += num.doubleValue(); // Works because it's guaranteed to be a subclass of Number
        }
        System.out.println("| Sum: " + sum);
    }

    // Method with Lower Bounded Wildcards
    public static void addIntegers(List<? super Integer> list) {
        list.add(42); // Adding Integer is allowed because Integer is compatible with the lower bound
        list.add(99);
    }

    public static void main(String[] args) {
        // Example of Unbounded Wildcards
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Wildcards");
        System.out.print("Unbounded Wildcards: ");
        printList(stringList);

        // Example of Upper Bounded Wildcards
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.print("Upper Bounded Wildcards: ");
        printNumbers(intList);

        // Example of Lower Bounded Wildcards
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);
        System.out.print("Lower Bounded Wildcards (After Adding Integers): ");
        printList(numberList);
    }
}
