// 4. Write a Java program to empty an hash set

import java.util.HashSet;
public class empty {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);
    }    
}
