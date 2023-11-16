import java.util.Scanner;

public class Program22 {

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
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];	
		}
		
		System.out.println("The sum of array contents is "+sum );

	}

}
