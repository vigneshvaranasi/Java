import java.util.*;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int index = Collections.binarySearch(numbers, 30);
        if(index < 0) {
            System.out.println("Element not found in the list");
            return;
        }
        else
            System.out.println("Element found at index: " + index);
    }
}