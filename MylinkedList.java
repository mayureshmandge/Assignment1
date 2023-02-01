package humancloud;
import java.util.Scanner;
public class MylinkedList {
	
	static Scanner sc=new Scanner(System.in);

	 Node head,tail;
	public class Node
	{
		 int data;
		 Node next;
	
	
	 Node(int d)
	 {
		 data=d;
		 next=null;
	 }
	 
	}
	public  void insert()
	{
		System.out.println("Enter the Element:");
		int data=sc.nextInt();
		
		 Node new_node= new Node(data);
			if(head==null)
			{
				head=new_node;
			}
			else
			{
				Node last=head;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=new_node;
				tail=new_node;
				tail.next=null;
			}
	}
	public void insertAtpos(int pos)
	{
		System.out.println("enter the data :");
		int data=sc.nextInt();
		Node new_node=new Node(data);
		
		 if(pos==1)
			{	
				new_node.next=head;
				head=new_node;
			}
		else 
		{
			Node temp=head;
			while(--pos>1)
				
			{
				System.out.println(pos);
					temp=temp.next;
			}
			
			new_node.next=temp.next;
			temp.next=new_node;
			System.out.println("Successfully inserted at giving positon !");
		}
				
			}
	public void delete()
	{
		
		if(head==null)
		{
		System.out.println("Linklist is empty");
			return ;
		}
		
		else
			if(head!=tail)
		{
			Node curr=head;
			while(curr.next!=tail)
			{
				curr=curr.next;
			}
		
			tail=curr;
			tail.next=null;
			System.out.println("successfully deleted from list !");
		}	
		
	}
	
	public  void printList()
	{
		Node curr=head;
		System.out.println("Linked list is:");
		System.out.println();
		while(curr.next!=null)
		{
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println(curr.data);

		
	}
	public static void main(String[] args) {
		MylinkedList ll=new MylinkedList();
		int opt;
		boolean flag=true;
		while(flag)
		{
			System.out.println("---------------------------------");
			System.out.println("1. Insert");
			System.out.println("2. DISPLAY");
			System.out.println("3. INSERT AT POSITION");
			System.out.println("4. DELETE");
			System.out.println("5. EXIT");
			System.out.println("Enter your Choice:");
			opt=sc.nextInt();
			switch(opt)
			{
			case 1: ll.insert();
					break;

			case 2: ll.printList();
					break;
					
			case 3:	
					System.out.println("enter the position :");
					int pos=sc.nextInt();
					ll.insertAtpos(pos);
					break;
					
			case 4: 
					ll.delete();
					break;
					
			case 5: 
					System.out.println("Program terminated !");
					flag=false;
					break;
			default :
					System.out.println("INVALID CHOICE ...!");
					break;
					
				
			}
		}
	}

}
