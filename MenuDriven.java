package humancloud;
import java.util.Scanner;
public class MenuDriven {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int opt;
		
		mainloop :while(true)
		{
			System.out.println("---------------------------------");
			System.out.println("1. ARRAY");
			System.out.println("2. STACK");
			System.out.println("3. LINKLIST");
			System.out.println("4. QUEUE");;
			System.out.println("5. EXIT");
			System.out.println("Enter your Choice:");
			 opt=sc.nextInt();
			switch(opt)
			{
			case 1:	myArray m1=new myArray();
					subloop:while(true)
					{
						System.out.println("---------------------------------");
						System.out.println("1. CREATE \n2. DISPLAY \n3. SEARCH \n4. DELETE \n5. SORT \n6. BACK");;
						System.out.println("Enter your Choice:");
						opt=sc.nextInt();
						switch(opt)
				 		{
				 			case 1:	
				 					m1.create();
				 					break;
				 			case 2:	
				 					m1.display();
				 					break;
				 			case 3:	
				 					System.out.println("Enter the element want to Search");
				 					System.out.println("Found at position : "+m1.search(sc.nextInt()));
				 					break;
				 			case 4:	
				 					m1.delete();
				 					break;
				 			case 5:	
				 					m1.sort();
				 					break;
				 			case 6:	
				 					System.out.println("BACK TO MENU -->");
				 					break subloop;
				 			default :
								System.out.println("INVALID CHOICE ...!");
								break;
				 		}
					}
			 		break;
			case 2:	MyStack s =new MyStack();
					subloop :while(true)
					{
						System.out.println("---------------------------------");
						System.out.println("1. PUSH \n2. POP \n3. PEEK \n4. DISPLAY \n5. BACK");
						System.out.println("Enter The Option");
						opt=sc.nextInt();
						switch(opt)
						{
						case 1: System.out.println("enter the element to push in stack:");
								s.push(sc.nextInt());
								break;
						
						case 2: System.out.println(s.pop()+" Element removed from the stack ");	
								break;
						case 3:
								System.out.println("Enter the element to push in stack:"+s.peek());
								break;
						case 4:
								System.out.println("Stack elements are: ");
								s.display();
								break;
						case 5:	
								System.out.println("BACK TO MENU --> ");
								break subloop;
						default :
								System.out.println("INVALID CHOICE ...!");
								break;
						}
				
					}
					break;
			case 3:	MylinkedList ll=new MylinkedList();
					
					subloop : while(true)
					{
						System.out.println("---------------------------------");
						System.out.println("1. Insert \n2. DISPLAY \n3. INSERT AT POSITION \n4. DELETE \n5. BACK");
						System.out.println("Enter your Choice:");
						opt=sc.nextInt();
						switch(opt)
						{
						case 1: ll.insert();
								break;
		
						case 2: ll.printList();
								break;
								
						case 3:	
								System.out.println("Enter the position :");
								int pos=sc.nextInt();
								ll.insertAtpos(pos);
								break;
								
						case 4: 
								ll.delete();
								break;
								
						case 5: 
								System.out.println("BACK TO MENU --> !");
								
								break subloop;
						default :
								System.out.println("INVALID CHOICE ...!");
								break;
								
							
						}
					}
					
					break;
			case 4:	myQueue q=new myQueue();
					
					subloop :while(true)
					{
						System.out.println("---------------------------------");
						System.out.println("1. ENQUEUE \n2. DEQUEUE \n3. DISPLAY \n4. PEEK \n5. BACK");
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
								System.out.println("BACK TO MENU --> !");
								break subloop;
						default :
								System.out.println("INVALID CHOICE ...!");
								break;
							
						}
					}
						
					break;
			case 5:	System.out.println("EXIT  !");
					break mainloop;
			
			default :System.out.println("INVALID CHOICE ...!");
			break;
			}
		}
		

	}

}
