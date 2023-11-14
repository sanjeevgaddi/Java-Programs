package methods;

import java.util.Scanner;

public class Search3 {
	 int linearSearch() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key element");
		int key=scan.nextInt();
		int temp = 0;
		int x = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
		
		
	}

}
