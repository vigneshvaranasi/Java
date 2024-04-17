// 4. Write a Java program to remove all mappings from a map.

import java.util.HashMap;
public class remove {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
        System.out.println("Original map: " + colors);
        colors.clear();
        System.out.println("Cleared map: " + colors);
    }    
}
