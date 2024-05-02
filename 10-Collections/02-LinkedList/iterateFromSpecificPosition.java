// 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.LinkedList;
import java.util.ListIterator;
public class iterateFromSpecificPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Violet");
        int startingPosition = 2;

        ListIterator<String> iterator = colors.listIterator(startingPosition);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }    
}
