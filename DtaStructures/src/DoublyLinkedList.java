import java.util.Scanner;

public class DoublyLinkedList {
	class Node
	{
		Node prevlink;
		int data;
		Node nextlink;
	}
	private Node first;
	private Scanner scan=new Scanner(System.in);
	
	public void insertRear()
	{
		Node temp;
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.prevlink=null;
		newnode.nextlink=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			temp=first;
			while(temp.nextlink!=null)
			{
				temp=temp.nextlink;
			}
			temp.nextlink=newnode;
			newnode.prevlink=temp;
		}
	}
	
	public void deleteRear()
	{
		Node temp;
		if(first==null)
		{
			System.out.println("Deletion not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else
		{
			temp=first;
			while(temp.nextlink.nextlink!=null)
			{
				temp=temp.nextlink;
			}
			System.out.println("Element deleted is "+temp.nextlink.data);
			temp.nextlink=null;
		}
	}
	
	public void insertFront()
	{
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.prevlink=null;
		newnode.nextlink=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			newnode.nextlink=first;
			first.prevlink=newnode;
			first=newnode;
		}
	}
	
	public void deleteFront()
	{
		if(first==null)
		{
			System.out.println("Deletion not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else
		{
			System.out.println("Element deleted is "+first.data);
			first=first.nextlink;
			first.prevlink=null;
		}
	}
	
	public void displayForward()
	{
		Node temp;
		if(first==null)
		{
			System.out.println("display not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.nextlink;
			}
			System.out.println();
		}
	}
	
	public void displayReverse()
	{
		Node temp;
		if(first==null)
		{
			System.out.println("display not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp.nextlink!=null)
			{
				temp=temp.nextlink;
			}
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.prevlink;
			}	
		}
		System.out.println();	
	}
	
}
