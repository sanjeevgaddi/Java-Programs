import java.util.Scanner;

public class Demo42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Demo d= new Demo();
		d.add();
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b= scan.nextInt();
		d.sub(a,b);
		int res=d.mul();
		System.out.println("Multiplication of "+a+" and "+b+" is "+res);
		System.out.println("Enter two numbers");
		int x = scan.nextInt();
		int y= scan.nextInt();
		int res1=d.div(a,b);
		System.out.println("Division of "+x+" and "+y+" is "+res1);

	}

}
