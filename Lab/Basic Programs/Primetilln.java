import java.util.Scanner;
import java.lang.Math;
class Primetilln
{
	boolean primeOrNot(int n)
	{	
		int temp=1;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
		    	temp=0;
		}
		if(temp==1)
			return true;
		else
			return false;
	}
	void printPrime(int n)
    {
        System.out.println("Primes upto "+n+" are:");
        for(int i=2;i<n;i++)
        {
            if(primeOrNot(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number to Print Primes Till That Number:");
		int n=in.nextInt();
		Primetilln obj=new Primetilln();
		obj.printPrime(n);
	}
}
