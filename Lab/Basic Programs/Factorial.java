import java.util.Scanner;
public class Factorial {
    void print(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial of " + n + " is " + fact);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number to give Factorial:");
        int n = in.nextInt();
        Factorial obj = new Factorial();
        obj.print(n);
        in.close();
    }
}
