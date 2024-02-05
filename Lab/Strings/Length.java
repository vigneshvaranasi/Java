
/* 3.Write a program to find the length of the string "refrigerator". */

import java.util.Scanner;

public class Length {
        public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=input.nextLine();
        System.out.println("The Length of Given String is:" +str.length());
        input.close();
    }
}
