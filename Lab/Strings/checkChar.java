
/* 4.Write a program to check if the letter 'e' is present in the word 'Umbrella'. */

import java.util.Scanner;

public class checkChar {
        public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=input.nextLine();
        System.out.println("Enter a Character to check it is there in the given string:");
        char ch=input.next().charAt(0);
        if(str.contains(String.valueOf(ch)))
            System.out.println("The Given Character is Present in the String");
        else
            System.out.println("The Given Character is not Present in the String");
        input.close();
    }
}