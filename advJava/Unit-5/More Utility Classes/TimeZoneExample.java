import java.util.TimeZone;

public class TimeZoneExample {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("Default Time Zone: " + timeZone.getID());
        System.out.println("Display Name: " + timeZone.getDisplayName());
    }
}
