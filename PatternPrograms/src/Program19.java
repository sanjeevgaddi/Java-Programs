
public class Program19 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			int a=65;
			for(int j=5;j>=i;j--)
			{
				
				System.out.print((char) (a+j)+" ");
				a+=2;
			}
			System.out.println();
		}
		
	}

}
