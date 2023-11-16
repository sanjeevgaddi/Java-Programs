import java.util.Scanner;

public class Program24 {

	public static void main(String[] sanju) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int a[]=new int[scan.nextInt()];
		System.out.println("Enter the values of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		//Displaying the array content 
		int product=1;
		for(int i=0;i<a.length;i++)
		{
			product=product*a[i];
		}
		
		System.out.println("The product of all array contents are "+product);

	}

}
