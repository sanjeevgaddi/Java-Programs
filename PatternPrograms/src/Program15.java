
public class Program15 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=10;j++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			System.out.print(" ");
			for(int j=1;j<=19;j++)
			{
				if(i==1||i==5||j==1||j==9||j==19||(i==3 && j==4)||(i==4 && j==4)||(i==3 && j==5)||(i==3 && j==6)||(i==4 && j==6)) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
