import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elemets of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the numbers to be rotated");
		int k=scan.nextInt();
		int temp[]=new int[k];
		int j=0;
		System.out.println("Right rotate");
		for(int i=k+1;i<arr.length;i++)
		{
			temp[j]=arr[i];
		}
		for(int i=0;i<k;i++)
		{
			arr[j]=arr[i];
			j++;
		}
		int x=0;
		for(int i=0;i<k;i++)
		{
			arr[i]=temp[x];
			x++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
