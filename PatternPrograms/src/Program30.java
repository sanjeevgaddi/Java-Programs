import java.util.Scanner;

public class Program30{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int a[]=new int[scan.nextInt()];
		System.out.println("Enter the values of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		int smallest2nd=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(smallest2nd<a[i])
			{
				smallest2nd=a[i];
			}
		}
		System.out.println("smallest2nd element in an arraya is "+smallest2nd);

	}

}
