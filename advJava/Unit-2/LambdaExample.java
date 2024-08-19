import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vignesh", "Fakruddin", "Varun", "Eswar","Varanasi");

        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("V"))
                                          .collect(Collectors.toList());

        System.out.println("Names: " + names);
        System.out.println("Filtered Names: " + filteredNames);
    }
}