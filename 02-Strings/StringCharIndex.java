
/* 7. Write a Java program to get the character at the given index within the String */

import java.util.Scanner;

public class StringCharIndex {
        public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String text = new String(get.nextLine());
        int index=get.nextInt();
        System.out.print("The character at given Index is:"+text.charAt(index));
        get.close();
    }
}
