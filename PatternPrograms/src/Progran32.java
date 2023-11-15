import java.util.Scanner;

public class Progran32 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int n = scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}

		//Creating Boolean Array
		boolean visited[]=new boolean[n];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int count=1;
			if(visited[i]==true)
			{
				continue;
			}
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					visited[j]=true;
				}
			}
			System.out.println("Frequency of "+arr[i]+" is "+count);
		}
	}

}
