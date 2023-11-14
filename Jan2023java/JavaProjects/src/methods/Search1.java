package methods;

import java.util.Scanner;

public class Search1 {
	void linearSearch() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[ ]=new int[scan.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key element");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("key found at the index "+i);
				return;
			}
		}
		System.out.println("Key not found");
	}

}
