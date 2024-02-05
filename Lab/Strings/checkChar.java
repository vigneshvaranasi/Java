import java.util.Scanner;

public class checkChar {
        public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=input.nextLine();
        System.out.println("Enter a String:");
        char ch=input.nextChar();
        System.out.println("The Given String is:" +str.contains("e"));
        input.close();
    }
}
