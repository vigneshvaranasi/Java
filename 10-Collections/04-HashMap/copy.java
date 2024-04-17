// 3. Write a Java program to copy all mappings from the specified map to another map

import java.util.HashMap;
public class copy {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
        System.out.println("Original map: " + colors);
        HashMap<Integer, String> colorsCopy = new HashMap<Integer, String>();
        colorsCopy.putAll(colors);
        System.out.println("Copied map: " + colorsCopy);
    }    
}
