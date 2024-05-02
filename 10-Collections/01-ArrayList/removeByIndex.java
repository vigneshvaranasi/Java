// 6. Write a Java program to remove the third element from an array list.
import java.util.ArrayList;
public class removeByIndex {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        colors.remove(2);
        System.out.println(colors);
    }
}
