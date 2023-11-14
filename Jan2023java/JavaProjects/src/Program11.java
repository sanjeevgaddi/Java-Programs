import java.util.Scanner;

public class Program11 {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1D length to create 3D jagged array");
		int[][][] arr=new int[scan.nextInt()][][];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter 2D length to create 1D  "+i);
			arr[i]=new int[scan.nextInt()][];	
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter 3D length for 1D "+i+" 2D "+j);
				arr[i][j]=new int[scan.nextInt()];
			}	
		}
		System.out.println("enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter an value to store in an array index arr["+i+"]["+j+"]["+k+"]");
					arr[i][j][k]=scan.nextInt();
				}
				
			}				
		}
		System.out.println("Array Contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();			
		}
	}
}
