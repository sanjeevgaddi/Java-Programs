package methods;

import java.util.Scanner;

public class RecBinarySearchApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a key element to be Searched ");
		int key = scan.nextInt();
		RecBinarySearch bs=new RecBinarySearch();
		int result=bs.binarySearch(arr, key);
		if(result == -1 )
		{
			System.out.println("Elements not found");
		}
		else
		{
			System.out.println("Element found at index "+result);  
		}

	}

}
