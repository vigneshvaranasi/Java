import java.util.Scanner;
import java.lang.Math;
class Prime
{
	void primeOrNot(int n)
	{	
		int temp=1;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
		    	temp=0;
		}
		if(temp==1)
			System.out.print("Given Number is Prime");
		else
			System.out.print("Given Number is not a Prime");
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number to Check if it is Prime or not:");
		int n=in.nextInt();
		Prime obj=new Prime();
		obj.primeOrNot(n);
	}
}
