import java.util.Scanner;

public class Program23 {

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
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
			else
			{
				sum1=sum1+a[i];
			}
		}
		
		System.out.println("The sum of even and odd array contents are "+sum+" and "+sum1 );

	}

}
