package methods;

import java.util.Scanner;

public class BinarySearch1 {
	//Without returntype without parameter 
	void binarySearch1()
	{
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
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("key is found at the index "+mid);
				return;
			}
			else if(key>arr[mid])
			{
				high=high;
				low=mid+1;
			}
			else
			{
				low=low;
				high=mid-1;
			}
		}
		System.out.println("Key not found");
	}

	//Without returntype and with parameter
	void binarySearch2(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("key is found at the index "+mid);
				return;
			}
			else if(key>arr[mid])
			{
				high=high;
				low=mid+1;
			}
			else
			{
				low=low;
				high=mid-1;
			}
		}
		System.out.println("Key not found");
	}
	
	//With returntype and without parameter
	int binarySearch3()
	{
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
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				high=high;
				low=mid+1;
			}
			else
			{
				low=low;
				high=mid-1;
			}
		}
		return -1;	
	}
	//with returntype and with parameter
	int binarySearch4(int arr1[],int key1)
	{
		int low=0;
		int high=arr1.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key1==arr1[mid])
			{
				
				return mid;
			}
			else if(key1>arr1[mid])
			{
				high=high;
				low=mid+1;
			}
			else
			{
				low=low;
				high=mid-1;
			}
		}
		return -1;

	}
}
	
