package methods;

import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=in.nextInt();
		int b=in.nextInt();
		
		Gcd g=new Gcd();
		
		int res=g.gcd1(a,b);
		System.out.println("The gcd of "+a+" and "+b+" is = "+res);
	}

}
