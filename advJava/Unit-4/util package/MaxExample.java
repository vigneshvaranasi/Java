import java.util.*;

public class MaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 1, 25, 3);
        int maxNumber = Collections.max(numbers);
        System.out.println("Maximum value: " + maxNumber);  // Output: 25
    }
}