import java.util.Scanner;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DoublyLinkedList dll=new DoublyLinkedList();
		while(true)
		{
			System.out.println("Press 1------------>INSERTREAR");
			System.out.println("Press 2------------>DELETEREAR");
			System.out.println("Press 3------------>INSERTFRONT");
			System.out.println("Press 4------------>DELETEFRONT");
			System.out.println("Press 5------------>DISPLAYFORWARD");
			System.out.println("Press 6------------>DISPLAYREVERSE");
			System.out.println("Enter any other number------>STOP");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
			switch(choice)
			{
				case 1: dll.insertRear();
						break;
				case 2:dll.deleteRear();
				
						break;
				case 3: dll.insertFront();
						break;
				case 4:dll.deleteFront();
						break;
				case 5:dll.displayForward();
						break;
				case 6:dll.displayReverse();
						break;
				default:System.exit(0);
			}
		}

	}

}
