import java.util.Scanner;

public class Program35 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]= {1,2,3,5,6};
		int n=arr.length;
		int sum=((n+1)*(n+2))/2;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum -= arr[i];
		}
		System.out.println(sum);
		
	}

}
