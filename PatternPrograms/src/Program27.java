import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int a[]=new int[scan.nextInt()];
		System.out.println("Enter the values of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		int largest=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(largest<a[i])
			{
				largest=a[i];
			}
		}
		System.out.println("largest element in an arraya is "+largest);

	}

}
