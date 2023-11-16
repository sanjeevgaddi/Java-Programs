import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter number of elements to be rotated");
		int k=scan.nextInt();
		int temp[]=new int[k];
		System.out.println("Left Rotate");
		for(int i=0;i<k;i++)
		{
			temp[i]=arr[i];
		}
		int j=0;
		for(int i=k;i<arr.length;i++)
		{
			arr[j]=arr[i];
			j++;
		}
		int x=0;
		for(int i=arr.length-k;i<arr.length;i++)
		{
			arr[i]=temp[x];
			x++;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
