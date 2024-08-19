import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        // Compare by length
        return Integer.compare(o1.length(), o2.length());
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("welcome");
        words.add("java");
        words.add("generics");
        words.add("advanced");
        words.add("programming");
        words.add("java1.5");

        // Sorting based on alphabetical order
        Collections.sort(words);
        System.out.println("Words sorted based on alphabetical order: " + words);

        // Sorting based on length using custom comparator
        MyComparator obj = new MyComparator();
        Collections.sort(words, obj);
        System.out.println("Words sorted based on length: " + words);
    }
}
