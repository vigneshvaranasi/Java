import java.util.*;

public class NCopiesExample {
    public static void main(String[] args) {
        List<String> repeatedList = Collections.nCopies(5, "Hello");
        System.out.println("Repeated list: " + repeatedList);
    }
}