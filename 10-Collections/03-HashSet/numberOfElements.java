// 3. Write a Java program to get the number of elements in a hash set.

import java.util.HashSet;
public class numberOfElements {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors.size());
    }
    
}
