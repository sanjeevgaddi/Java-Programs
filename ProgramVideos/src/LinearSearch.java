import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n=scan.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the array contents");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println("Enter the elements");
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter a key to search");
		int key=scan.nextInt();
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(key==arr1[i])
			{
				System.out.println("Key is found at the index "+i);
				System.exit(0);
			}
		}
		System.out.println("Key is not found");
	}

}
