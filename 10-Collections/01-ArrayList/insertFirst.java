// 3. Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;
public class insertFirst {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        colors.add(0, "Violet");
        System.out.println(colors);
    }   
}