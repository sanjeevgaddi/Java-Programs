package methods;

import java.util.Scanner;

public class RecGCDApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to find GCD ");
		int m=scan.nextInt();
		int n=scan.nextInt();
		RecGCD rGCD=new RecGCD();
		int res=rGCD.findGCD(m, n);
		System.out.println("The GCD of two number "+m+" and "+n+" is "+res);

	}

}
