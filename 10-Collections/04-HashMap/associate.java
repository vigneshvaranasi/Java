// 1. Write a Java program to associate the specified value with the specified key in a HashMap.

import java.util.HashMap;
public class associate {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
        System.out.println(colors);
    }    
}
