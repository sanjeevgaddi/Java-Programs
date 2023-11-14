import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of a array");
		String[] arr = new String[scan.nextInt()];
		
		System.out.println("Enter a String to store it in an array");
		String element = scan.next();
		
		System.out.println("Enter the position in between 0 to "+(arr.length-1));
		int position = scan.nextInt();
		
		arr[position]=element;
		
		System.out.println("The string stored in the entered position "+position+" is "+arr[position]);

	}

}
