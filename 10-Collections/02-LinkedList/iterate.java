// 2. Write a Java program to iterate through all elements in a linked list.

import java.util.LinkedList;
public class iterate {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        for (String color : colors) {
            System.out.println(color);
        }
    }
    
}
