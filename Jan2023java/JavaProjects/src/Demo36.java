
public class Demo36 {

	public static void main(String[] args) {
		char arr1[]= {'a','b','c','d','e','f'};
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
				arr2[j]=arr1[i]	;
				j--;
			
		}
		System.out.println("Array -1 contents are");
		for(char c:arr1)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("Array -2 contents are");
		for(char d:arr2)
		{
			System.out.print(d+" ");
		}

	}

}
