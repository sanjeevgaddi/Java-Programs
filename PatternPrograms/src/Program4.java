/*Print the below pattern
  *****$$$$$
  *****$$$$$
  *****$$$$$
  *****$$$$$
  *****$$$$$
 */
public class Program4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			
			for(int j=1;j<=5;j++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
		
	}

}


