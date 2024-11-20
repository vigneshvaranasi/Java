import java.util.ArrayList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorExample {
    public static void main(String[] args) {
        // Create a list of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Obtain a Spliterator
        Spliterator<Integer> spliterator = numbers.spliterator();

        // Using trySplit()
        Spliterator<Integer> split1 = spliterator.trySplit();
        System.out.println("Split1 traverses:");
        split1.forEachRemaining(System.out::println);

        System.out.println("\nOriginal Spliterator after trySplit:");
        spliterator.forEachRemaining(System.out::println);

        // Reset the list for more examples
        numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        spliterator = numbers.spliterator();

        // Using estimateSize() and getExactSizeIfKnown()
        System.out.println("\nEstimated size: " + spliterator.estimateSize());
        System.out.println("Exact size (if known): " + spliterator.getExactSizeIfKnown());

        // Using tryAdvance()
        spliterator = numbers.spliterator(); // Re-obtain Spliterator
        System.out.println("\nUsing tryAdvance:");
        spliterator.tryAdvance(System.out::println); // Processes one element
        spliterator.tryAdvance(System.out::println); // Processes another element

        // Using forEachRemaining()
        System.out.println("\nUsing forEachRemaining:");
        spliterator.forEachRemaining(System.out::println);

        // Using characteristics()
        System.out.println("\nCharacteristics: " + spliterator.characteristics());
    }
}