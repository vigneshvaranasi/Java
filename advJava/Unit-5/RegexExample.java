import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        // Step 2: Define the regular expression
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        // Step 3: Compile the pattern
        Pattern pattern = Pattern.compile(emailRegex);

        // Test email addresses
        String[] emailAddresses = {
            "test@example.com",
            "invalid-email",
            "user@domain.co.uk",
            "user@domain",
            "user@domain.c"
        };

        // Step 4 and 5: Create a matcher and perform matching
        for (String email : emailAddresses) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is not a valid email address.");
            }
        }
    }
}