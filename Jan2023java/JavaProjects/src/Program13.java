import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Value of a and b before swapping are a="+a+" and b="+b);
		//int help;
		//help = a;
		//a = b;
		//b = help;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a and b after swapping are a="+a+" and b="+b);
		
		 

	}

}
