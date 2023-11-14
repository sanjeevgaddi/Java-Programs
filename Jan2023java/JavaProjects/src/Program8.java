import java.util.Scanner;

public class Program8 {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1D and 2D length of an array");
		int[][] arr=new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Array elements are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the array elements to store in index "+i);
				arr[i][j]=scan.nextInt();
			}				
		}
		System.out.println("Array Contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();			
		}
	}

}
