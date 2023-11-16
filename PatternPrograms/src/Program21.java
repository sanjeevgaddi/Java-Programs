import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int a[]=new int[scan.nextInt()];
		System.out.println("Enter the values of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		//Displaying the array content 
		for(int i=0;i<a.length;i++)
		{
			//if(i%2!=0)
			//if(i%2==0)
			//if(a[i]%2==0)
			//if(a[i]%2!=0)
			//if(i%3==0)
			//if(i%4==0)
			//if(i%3==0&&i%5==0)
			if(i%3==0||i%5==0)
			{
				System.out.print(a[i]+" ");
			}
			
		}

	}

}
