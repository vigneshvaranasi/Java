// 2. Write a Java program to iterate through all elements in an array list

import java.util.ArrayList;
public class iterate {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
