import java.util.*;

public class ShuffleExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vignesh", "Fakruddin", "Eswar", "Pavan", "Sumanth");
        Collections.shuffle(names);
        System.out.println("Shuffled list: " + names);
    }
}