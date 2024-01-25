import java.util.Scanner;
class EvenorOdd
{
	void print(int n)
	{
		if(n%2==0)
			System.out.print("Given Number is Even");
		else
			System.out.print("Given Number is Odd");		
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number to Check if it is Even or Odd:");
		int n=in.nextInt();
		EvenorOdd obj=new EvenorOdd();
		obj.print(n);
		in.close();
	}
}
