import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Modify elements
        fruits.set(1, "Blueberry");
        System.out.println("Modified second fruit: " + fruits.get(1)); // Output: Blueberry

        // Remove elements
        fruits.remove("Cherry");
        System.out.println("Fruits after removal: " + fruits); // Output: [Apple, Blueberry]

        // Size of the list
        System.out.println("Size of the list: " + fruits.size()); // Output: 2

        // Iterate over elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Output: Apple Blueberry (each on a new line)

        // Check if list contains an element
        System.out.println("List contains 'Apple': " + fruits.contains("Apple")); // Output: true

        // Convert to array
        String[] fruitArray = fruits.toArray(new String[0]);
        for(int i=0; i<fruitArray.length; i++) {
            System.out.println(fruitArray[i]);
        }
    }
}
