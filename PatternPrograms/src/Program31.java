import java.util.Scanner;

public class Program31 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the values of an array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
				
			}
		}
		System.out.println("Aray Contents before removal of Duplicates");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		int temp[]=new int[arr.length];
		int j=0;
		temp[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=temp[j])
			{
				j++;
				temp[j]=arr[i];
			}
			
		}
		System.out.println("========================");
		System.out.println("Aray Contents after removal of Duplicates");
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]!=0)
			{
				System.out.print(temp[i]+" ");
			}
			
		}
		
	}

}
