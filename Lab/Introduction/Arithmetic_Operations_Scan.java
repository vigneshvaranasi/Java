import java.util.Scanner;
public class Arithmetic_Operations_Scan {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 Numbers to perform Operation:");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Enter Operation to perform:");
        char op=s.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("The Sum of 2 Numbers is:"+(a+b));
                break;
            case '-':
                System.out.println("The Difference of 2 Numbers is:"+(a-b));
                break;
            case '*':
                System.out.println("The Multiplication of 2 Numbers is:"+(a*b));
                break;
            case '/':
                System.out.println("The Division of 2 Numbers is:"+(a/b));
                break;
            case '%':
                System.out.println("The Mod of 2 Numbers is:"+(a%b));
                break;
                
            default:
                System.out.println("Operation Not Found");
                break;
        }
        s.close();
    }
}
