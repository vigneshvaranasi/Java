import java.util.Scanner;
class Fibonacci
{
	void print(int n)
	{
		int a=0;
		int b=1;
		while(n>1)
		{
			System.out.print(a+" ");
			System.out.print(b+" ");
			int temp=a;
			a=a+b;
			b=a+b;			
			n=n-2;
		}
		if(n==1)
			System.out.print(a+" ");
		
		
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Total Number of Series Needed:");
		int n=in.nextInt();
		Fibonacci obj=new Fibonacci();
		obj.print(n);
	}
}
