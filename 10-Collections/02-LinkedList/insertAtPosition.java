// 5. Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.LinkedList;
public class insertAtPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Original linked list: " + colors);
        colors.add(1, "Yellow");
        System.out.println("After inserting 'Yellow' at the second position of the linked list: " + colors);
    }    
}
