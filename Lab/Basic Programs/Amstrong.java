import java.util.Scanner;
class Amstrong
{
	void print(int n)
	{	
		int org=n,sum=0,pow=n%10;
		while(n>0)
		{	
			int rem=n%10;
			int num=1;
			for(int i=0;i<pow;i++)
			{
				num=num*rem;
			}
			sum=sum+num;
			n=n/10;
		}	
		if(sum==org)
			System.out.print("Given Number is Amstrong");
		else
			System.out.print("Given Number is not a Amstrong");
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number to Check if it is Amstrong or not:");
		int n=in.nextInt();
		Amstrong obj=new Amstrong();
		obj.print(n);
		in.close();
	}
}
