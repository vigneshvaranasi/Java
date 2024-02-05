import java.util.Scanner;

public class inputOutput {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=input.next();
        System.out.println("The Given String is:" +str);
        input.close();
    }
}
