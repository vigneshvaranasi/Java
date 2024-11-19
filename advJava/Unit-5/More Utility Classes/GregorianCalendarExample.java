import java.util.GregorianCalendar;

public class GregorianCalendarExample {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = 2024;
        System.out.println("Year " + year + " is a leap year? " + calendar.isLeapYear(year));

        // getActualMaximum() method
        System.out.println("Maximum number of days in a month: " + calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));

        // getActualMinimum() method
        System.out.println("Minimum number of days in a month: " + calendar.getActualMinimum(GregorianCalendar.DAY_OF_MONTH));
        
    }
}
