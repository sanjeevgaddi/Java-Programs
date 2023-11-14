package methods;
import java.util.Scanner;

public class Square1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        for (int i = 1; i <= n; i++) {
        	System.out.print(i);
        }
        System.out.println();
        for(int i=2;i<=n-1;i++)
        {
        	System.out.println(i+"   "+(n-i+1));
        }
        for(int i=n;i>=1;i--)
        {
        	System.out.print(i);
        }
        System.out.println();
            
        
    }
}
