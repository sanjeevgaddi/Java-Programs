package methods;

import java.util.Scanner;

public class SearchApp4 {

	public static void main(String[] args) {
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
		Search4 search4=new Search4();
		int res=search4.linearSearch(arr,key);
		
		if(res>=0)
		{
			System.out.println("key found at the index "+res);
		}
		else
		{
			System.out.println("Key not found");
		}

	}

}
