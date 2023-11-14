
public class Demo1 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println("The values in th even position of array are");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("========================================");
		System.out.println("The values in the odd position  of array are");
		for(int i=0;i<arr.length-1;i++)
		{
			if(i%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
