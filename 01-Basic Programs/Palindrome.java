import java.util.Scanner;
class Palindrome
{
	void print(int n)
	{	
		int org=n;
		int rev=0;
		while(n>0)
		{	
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}	
		if(rev==org)
			System.out.print("Given Number is Palindrome");
		else
			System.out.print("Given Number is not a Palindrome");
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number to Check if it is Palindrome or not:");
		int n=in.nextInt();
		Palindrome obj=new Palindrome();
		obj.print(n);
		in.close();
	}
}
