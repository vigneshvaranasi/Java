import java.util.SimpleTimeZone;

public class SimpleTimeZoneISTExample {
    public static void main(String[] args) {
        // Create a SimpleTimeZone object for IST (GMT+5:30)
        SimpleTimeZone stz = new SimpleTimeZone(
            5 * 60 * 60 * 1000 + 30 * 60 * 1000, // GMT offset in milliseconds
            "IST" // Time Zone ID
        );

        // Display the Time Zone ID and Offset
        System.out.println("Time Zone ID: " + stz.getID());
        System.out.println("Raw Offset (in hours): " + stz.getRawOffset() / (60 * 60 * 1000) + " hours " +
                           (stz.getRawOffset() % (60 * 60 * 1000)) / (60 * 1000) + " minutes");
    }
}
