package methods;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		BinarySearch1 bs1=new BinarySearch1();
		bs1.binarySearch1();
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter thr array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a key element");
		int key=scan.nextInt();
		bs1.binarySearch2(arr,key);
		
		int res=bs1.binarySearch3();
		if(res>=0)
		{
			System.out.println("Key found at the index "+res);
		}
		else
		{
			System.out.println("Key not found ");
		}
		
		
		Scanner scan1 =new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int arr1[]=new int[scan1.nextInt()];
		System.out.println("Enter thr array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=scan1.nextInt();
		}
		System.out.println("Enter a key element");
		int key1=scan1.nextInt();
		int res1=bs1.binarySearch4(arr1, key1);
		if(res1>=0)
		{
			System.out.println("Key found at the index "+res1);
		}
		else
		{
			System.out.println("Key not found ");
		}
		

	}

}
