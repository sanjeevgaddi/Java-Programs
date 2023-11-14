import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1D and 2D and 3D length to create an 3 dimensional array");
		int[][][] arr = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		for(int i=0; i<=arr.length-1;i++)
		{
			for(int j=0; j<=arr.length-1;j++)
			{
				for(int k=0;k<=arr.length-1;k++)
				{
					System.out.println("Enter the value to store in array index["+i+"]["+j+"]["+k+"]");
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		System.out.println("Array contents are");
		for(int i=0; i<=arr.length-1;i++)
		{
			for(int j=0; j<=arr.length-1;j++)
			{
				for(int k=0;k<=arr.length-1;k++)
				{
					System.out.print(arr[i][j][k]+" ");
					 
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
