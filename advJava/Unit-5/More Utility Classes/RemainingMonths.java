import java.util.Calendar;

public class RemainingMonths {
    public static void main(String[] args) {
        // Get the current month using Calendar
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH); // Current month (0-based, 0 = January)

        // Print remaining months
        System.out.println("Remaining months in the year:"+(12-currentMonth-1));
    }
}
