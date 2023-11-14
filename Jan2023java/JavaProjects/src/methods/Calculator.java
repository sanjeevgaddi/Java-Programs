package methods;
import java.util.Scanner;
public class Calculator {
	Scanner scan=new Scanner(System.in);
	//Addition of two numbers
	void add()
	{
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);	
	}
	//Subtraction of two numbers
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction of "+a+" and "+b+" is "+c);
	}
	//Multiplication of two numbers
	int mul()
	{
		System.out.println("Enter two numbers");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int c=x*y;
		return c;	
	}
	//Division of two numbers
	int div(int x,int y)
	{
		int z=x/y;
		return z;	
	}
}
