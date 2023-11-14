import java.util.Scanner;

public class Demo {
	void add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b= scan.nextInt();
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
	}
	
	void sub(int x,int y)
	{
		int z=x-y;
		System.out.println("Substraction of "+x+" and "+y+" is "+z);
	}
	
	int mul()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b= scan.nextInt();
		int c=a*b;
		return c;
	}
	
	int div(int x,int y)
	{
		int z=x/y;
		return z;
	}
}
	
