import java.util.Collection;
import java.util.List;

public class A2 {
    public static boolean isOdd(Integer number) {
        return number % 2 != 0;
    }

    // Generic method to count odd integers in a collection
    public static int countOddNumbers(Collection<Integer> collection) {
        int count = 0;

        for (Integer element : collection) {
            if (isOdd(element)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Count odd numbers
        int oddCount = countOddNumbers(numbers);
        System.out.println("Number of odd integers: " + oddCount); // Output: 5
    }
}