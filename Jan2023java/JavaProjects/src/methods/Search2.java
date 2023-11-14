package methods;

import java.util.Scanner;

public class Search2 {
	void linearSearch(int[] arr,int key)
	{
		int temp=0;
		int x=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				temp=1;
				x=i;
			}
		}
		if(temp==1) 
		{
			System.out.println("Key is found at index "+x);
		}
		else
		{
			System.out.println("Key not found");
		}
		
	}
}
