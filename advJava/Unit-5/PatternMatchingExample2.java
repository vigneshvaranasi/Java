import java.util.regex.*;

public class PatternMatchingExample2 {
    public static void main(String[] args) {
        // Use the matches method directly
        boolean result = Pattern.matches("J.+a", "Java");

        // Print the result
        System.out.println(result);  // Output: true
    }
}