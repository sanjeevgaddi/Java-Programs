package methods;

import java.util.Scanner;

public class SearchApp2 {

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
		Search2 search2=new Search2();
		search2.linearSearch(arr,key);

	}

}
