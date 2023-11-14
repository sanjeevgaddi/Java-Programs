package methods;

import java.util.Scanner;

public class RecFactorialApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to find the factorial");
		int n=scan.nextInt();
		RecFactorial rf=new RecFactorial();
		int res=rf.fact(n);
		System.out.println("Factorial of Entered number "+n+" is "+res);
	}

}
