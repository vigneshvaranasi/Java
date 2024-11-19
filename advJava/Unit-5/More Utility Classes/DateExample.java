import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        // Get time in milliseconds
        long timeInMillis = currentDate.getTime();
        System.out.println("Milliseconds since Epoch: " + timeInMillis);
    }
}
