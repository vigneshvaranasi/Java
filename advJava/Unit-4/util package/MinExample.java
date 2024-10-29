import java.util.*;

public class MinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 1, 25, 3);
        int minNumber = Collections.min(numbers);
        System.out.println("Minimum value: " + minNumber);  // Output: 1
    }
}