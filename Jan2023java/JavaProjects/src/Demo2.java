import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Numbers");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("Arr =");
		for(int i=0;i<=arr.length-1;i++)
		{	
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter two postion from 0 to "+(arr.length-1));
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		//int help;
		//help = arr[n1];
		//arr[n1]=arr[n2];
		//arr[n2]=arr[help];
		arr[n1]=arr[n1]+arr[n2];
		arr[n2]=arr[n1]-arr[n2];
		arr[n1]=arr[n1]-arr[n2];
		System.out.println("Array contents after swapping are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
