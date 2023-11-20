package java.DataStructure;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length ");
		int n=scan.nextInt();
		Array a=new Array(n);
		while(true)
		{
			System.out.println("Press 1------------>INSERTING");
			System.out.println("Press 2------------>DELETING");
			System.out.println("Press 3------------>DISPLAY");
			System.out.println("Enter any other number for exiting ");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
			switch(choice)
			{
				case 1: a.insert();
						break;
				case 2: a.delete();
						break;
				case 3: a.display();
						break;
				default:System.exit(0);
			}
		}
	}
}
