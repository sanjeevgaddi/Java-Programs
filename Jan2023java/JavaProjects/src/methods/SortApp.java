package methods;

import java.util.Scanner;

public class SortApp {

	public static void main(String[] args) {
		System.out.println("====================================");
		Sort s1=new Sort();
		s1.bubbleSort1();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("====================================");
		s1.bubbleSort2(arr);
		int arr1[]=s1.bubbleSort3();
		System.out.println("Array elements after sorting ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("====================================");
		System.out.println("Enter the length of array");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		
		System.out.println("====================================");
		int arr3[]=s1.bubbleSort4(arr2);
		System.out.println("Array elements after sorting ");
		for(int i=0;i<=arr3.length-1;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

}
