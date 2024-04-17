// 2. Write a Java program to iterate through all elements in a hash list

import java.util.HashSet;
public class iterate {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        for (String color : colors) {
            System.out.println(color);
        }
    }
    
}

