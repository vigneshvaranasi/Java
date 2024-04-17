// 1. Write a Java program to append the specified element to the end of a hash set

import java.util.HashSet;
public class append {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        colors.add("Yellow");
        System.out.println(colors);
    }
}
