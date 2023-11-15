import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int a[]=new int[scan.nextInt()];
		System.out.println("Enter the values of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Array contents before sorting");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}

		//int temp=0;
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println();
		System.out.println("Array contents after sorting");
        
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}System.out.println();
		
		System.out.println("First largest number in an array is "+a[a.length-1]);
		System.out.println("First smallest number in an array is "+a[0]);
		System.out.println("second largest number in an array is "+a[a.length-2]);
		System.out.println("second smallest number in an array is "+a[1]);
		
		
		System.out.print("duplicates elements in an array is ");
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.print(a[i]+" ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println("total count of duplicates in an array is "+count);
	}

}
