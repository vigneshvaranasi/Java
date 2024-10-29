import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationExample {
    public static void main(String[] args) {
        // Define the regular expressions
        String nameRegex = "^[A-Za-z]{2,}$";  // Names should have at least 2 letters
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$"; // At least 8 characters, 1 number, 1 uppercase and 1 lowercase letter
        String mobileRegex = "^[789]\\d{9}$"; // Indian mobile number: starts with 7, 8, or 9, followed by 9 digits
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"; // Standard email format

        // Test values
        String name = "Vignesh";
        String password = "Password123";
        String mobileNumber = "9876543210";
        String email = "test@example.com";

        // Validate Name
        validateInput(name, nameRegex, "Name");

        // Validate Password
        validateInput(password, passwordRegex, "Password");

        // Validate Mobile Number
        validateInput(mobileNumber, mobileRegex, "Mobile Number");

        // Validate Email ID
        validateInput(email, emailRegex, "Email ID");
    }

    private static void validateInput(String input, String regex, String type) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " is a valid " + type + ".");
        } else {
            System.out.println(input + " is not a valid " + type + ".");
        }
    }
}