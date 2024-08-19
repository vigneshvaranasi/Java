import java.util.List;

// Define the UnaryPredicate interface
@FunctionalInterface
interface UnaryPredicate<T> {
    boolean test(T obj);
}

public class B2 {

    // Method to calculate the greatest common divisor (GCD)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to find the first integer in the range [begin, end] that satisfies the predicate
    public static Integer findFirst(List<Integer> list, int begin, int end, UnaryPredicate<Integer> p) {
        for (int i = begin; i <= end && i < list.size(); i++) {
            Integer value = list.get(i);
            if (p.test(value)) {
                return value;
            }
        }
        return null; // Return null if no result found
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15, 25, 30, 44);

        // List of specified integers to check against
        List<Integer> specifiedNumbers = List.of(7, 10, 14);

        // Predicate to check if a number is relatively prime to all numbers in specifiedNumbers
        UnaryPredicate<Integer> isRelativelyPrime = num -> {
            return specifiedNumbers.stream()
                                   .allMatch(specifiedNum -> gcd(num, specifiedNum) == 1);
        };

        // Call the findFirst method
        Integer result = findFirst(numbers, 0, numbers.size() - 1, isRelativelyPrime);
        System.out.println("First relatively prime integer: " + result); // Output depends on the numbers list and specifiedNumbers
    }
}
