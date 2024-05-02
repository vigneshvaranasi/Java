// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;

class colors {
  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    System.out.println(colors);
  }
}