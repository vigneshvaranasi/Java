import java.util.Scanner;

public class largestOfThree {
    void print(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3)
            System.out.print("Largest Number is " + n1);
        else if (n2 > n1 && n2 > n3)
            System.out.print("Largest Number is " + n2);
        else
            System.out.print("Largest Number is " + n3);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a First Number:");
        int n1 = in.nextInt();
        System.out.println("Enter a Second Number:");
        int n2 = in.nextInt();
        System.out.println("Enter a Third Number:");
        int n3 = in.nextInt();
        largestOfThree obj = new largestOfThree();
        obj.print(n1, n2,n3);
        in.close();
    }
}
