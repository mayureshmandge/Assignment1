package humancloud;
import java.util.Scanner;

public class myQueue {

static Scanner sc=new Scanner(System.in);

	 QNode front,rear;
	 class QNode
	{
		int data;
		QNode next;
	
	 QNode(int key)
	{
		data=key;
		next=null;
	}
	}
	 public void Enqueue()
	 {
		 System.out.println("enter the element :");
		 int a=sc.nextInt();
		 QNode temp=new QNode(a);
		 if(rear==null && front==null)
		 {
			 front=rear=temp;
			 return;
		 }
		 else
		 {
		 rear.next=temp;
		 rear=temp;
		 }
	 }
	 public void  Dequeue()
	 {
		 QNode temp;
		 if(front==null && rear==null)
		 {
			 System.out.println("Queue is Empty:");
			 
		 }
		 else
		 {
			 temp=front;
			 front=front.next;
			 System.out.println("Deleted element is:"+temp.data); 
			
		 }
		 
		 
	 }
	 public void peek()
	 {
		 
		 if(front==null)
		 {
			 System.out.println("Queue is empty");
		 }
		 else
		 {
			 System.out.println("Peek element is:"+front.data);
		 }
	 }
	 public void display()
	 {
		 QNode node= front;
		 if(node==null)
		 {
			 System.out.println("Queue is empty !");
			 
			 
		 }
		 else
		 {
			 System.out.println("Queue list is:");
			 
			 while(node!=null)
			 {
				 System.out.print("  "+node.data+"\t");
				 node=node.next;
			 }
			 System.out.println();
		 }
	 }
	public static void main(String[] args) {
		myQueue q=new myQueue();
		int opt;
		mainloop : while(true)
		{
			System.out.println("---------------------------------");
			System.out.println("1. ENQUEUE");
			System.out.println("2. DEQUEUE");
			System.out.println("3. DISPLAY");
			System.out.println("4. PEEK");
			System.out.println("5. EXIT");
			System.out.println("Enter your Choice:");
			opt=sc.nextInt();
			switch(opt)
			{
			case 1: q.Enqueue();
					break;

			case 2:
					q.Dequeue();
						
					break;
					
			case 3:	
					q.display();
					break;
					
			case 4: 
					q.peek();
					break;
					
			case 5:  
					System.out.println("Program terminated !");
					break mainloop;
			default :
					System.out.println("INVALID CHOICE ...!");
					break;
				
			}
		}
	}

}
