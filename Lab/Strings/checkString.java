import java.util.Scanner;

public class checkString {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=input.nextLine();
        System.out.println("Enter a String to check:");
        String checksStr=input.nextLine();
        if(str.contains(checksStr))
            System.out.println("The Given String Contains the Word:"+checksStr);
        else
            System.out.println("The Given String does not Contain the Word:"+checksStr);
        input.close();
    }
}
