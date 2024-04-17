// 1. Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;
public class append {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        colors.addLast("Yellow");
        System.out.println(colors);
    }
    
}
