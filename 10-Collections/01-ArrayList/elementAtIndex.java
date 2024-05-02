// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.ArrayList;
public class elementAtIndex {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        System.out.println("Element at index 1: " + colors.get(1));        
    }
    
}
