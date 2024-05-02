// 5. Write a Java program to update an array element by the given element.
import java.util.ArrayList;
public class updateByElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        colors.set(1, "Violet");
        System.out.println(colors);
    }
}
