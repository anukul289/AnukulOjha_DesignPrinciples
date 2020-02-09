import java.util.Scanner;
public class Calculator 
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mult(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return (int)a/b;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a & b :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nEnter your choice : ");
		int ch=sc.nextInt();
		int res;
		switch(ch)
		{
			case 1: res=add(a,b);
				break;
			case 2: res=sub(a,b);
				break;
			case 3: res=mult(a,b);
				break;
			case 4: res=div(a,b);
				break;
			default : res=0;
		}
		if(res!=0)
			System.out.println("Result is : "+res);
	}
}