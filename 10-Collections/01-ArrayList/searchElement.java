// 7. Write a Java program to search for an element in an array list.
import java.util.ArrayList;
public class searchElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        if (colors.contains("Green")) {
            System.out.println("Green is present in the list.");
        } else {
            System.out.println("Green is not present in the list.");
        }
    }
}
