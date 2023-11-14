package methods;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calci=new Calculator();
		calci.add();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		calci.sub(a,b);
		
		int res=calci.mul();
		System.out.println("Multiplication of x and y is "+res);
		
		System.out.println("Enter two numbers");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int res1=calci.div(x, y);
		System.out.println("Division of "+x+" and "+y+" is "+res1);
	}

}
