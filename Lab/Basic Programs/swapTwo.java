import java.util.Scanner;

public class swapTwo {
    void print(int n1,int n2)
    {
        System.out.println("Before Swapping First Number is "+n1+" and Second Number is "+n2);
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After Swapping First Number is "+n1+" and Second Number is "+n2);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a First Number:");
        int n1 = in.nextInt();
        System.out.println("Enter a Second Number:");
        int n2 = in.nextInt();
        swapTwo obj = new swapTwo();
        obj.print(n1,n2);
        in.close();
    }
}
