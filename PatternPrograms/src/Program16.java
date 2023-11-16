
public class Program16 {

	public static void main(String[] args) {
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(i==1||j==1||i==11||j==11||i==6||j==6||i==j||i+j==12||i+j==7||i-j==5||j-i==5||i+j==17)
				{
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
