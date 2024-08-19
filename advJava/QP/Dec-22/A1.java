import java.util.List;

public class A1 {

    // Generic method to find the maximum element in a list within the range [begin, end]
    public static <T extends Comparable<T>> T findMaxInRange(List<T> list, int begin, int end) {
        if (list == null || list.isEmpty() || begin < 0 || end >= list.size() || begin > end) {
            throw new IllegalArgumentException("Invalid range or list is empty.");
        }

        T max = list.get(begin);

        for (int i = begin + 1; i <= end; i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 3, 7, 0, 9, 5);
        System.out.println("Max in range [1, 4]: " + findMaxInRange(intList, 1, 4)); // Output: 9

        List<String> strList = List.of("apple", "orange", "banana", "pear", "grape");
        System.out.println("Max in range [2, 4]: " + findMaxInRange(strList, 2, 4)); // Output: pear
    }
}
