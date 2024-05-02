// 8. Write a Java program to sort a given array list.
import java.util.ArrayList;
public class sort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Before sorting:");
        System.out.println(colors);
        colors.sort(null);
        System.out.println("After sorting:");
        System.out.println(colors);
    }
}
