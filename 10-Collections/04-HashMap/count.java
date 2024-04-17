// 2. Write a Java program to count the number of key-value (size) mappings in a map

import java.util.HashMap;
public class count {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
        System.out.println(colors.size());
    }
    
}
