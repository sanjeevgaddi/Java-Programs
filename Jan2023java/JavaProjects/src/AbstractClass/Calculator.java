package AbstractClass;

import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);
	
	void multiplication()
	{
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int mul=num1*num2;
		System.out.println("Multiplication of "+num1+ " and "+num2+" is "+mul);
		
	}
	void reminder()
	{
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int rem=num1%num2;
		System.out.println("Reminder of "+num1+ " and "+num2+" is "+rem);
		
	}
	void Square()
	{
		System.out.println("Enter a number");
		int num1=scan.nextInt();
		int square=num1*num1;
		System.out.println("square of "+num1+ " is "+square);
		
	}

}
