
/* 5.Write a program to check if the word 'orange' is present in the "This is orange juice". */

import java.util.Scanner;

public class checkString {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=input.nextLine();
        System.out.println("Enter a String to check it is there in the given string:");
        String checksStr=input.next();
        if(str.contains(checksStr))
            System.out.println("The Given String Contains the Word:"+checksStr);
        else
            System.out.println("The Given String does not Contain the Word:"+checksStr);
        input.close();
    }
}
