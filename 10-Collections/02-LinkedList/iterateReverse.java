// 4. Write a Java program to iterate a linked list in reverse order

import java.util.LinkedList;
public class iterateReverse {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Original linked list: " + colors);
        for (int i = colors.size() - 1; i >= 0; i--) {
            System.out.println(colors.get(i));
        }
    }    
}
