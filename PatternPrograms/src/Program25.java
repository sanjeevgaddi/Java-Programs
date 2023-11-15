import java.util.Scanner;

public class Program25 {

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
		int average;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		average=sum/a.length;
		System.out.println("The average of all array contents is "+average);

	}

}


