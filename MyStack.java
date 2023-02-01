package humancloud;
import java.util.Scanner;
public class MyStack {
	static Scanner sc=new Scanner(System.in);
	 int max=5;
	 int top;
	 int a[]=new int[max];
	MyStack()
	{
		top=-1;
	}
	 void push(int value)
	{
		if(top>=(max-1))
		{
			System.out.println("Stack is full:");
		
		}
		else
		{
			a[++top]=value;
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("stack is empty");
			return 0;
		}
		else
		{
			int n=a[top--];
			return n;
		}
			
	}
	int peek()
	{
		if(top<0)
		{
			System.out.println("stack is empty");
			return 0;
		}
		else
		{
			int x=a[top];
			return x;
		}
	}
	  void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println("|      |");
			System.out.println("   "+a[i]);
			
		}
	}
	public static void main(String[] args) {
		MyStack s =new MyStack();
	
		int opt;
		boolean flag=true;
		while(flag)
		{
			System.out.println();
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. PEEK");
			System.out.println("4. DISPLAY");
			System.out.println("5. EXIT");
			System.out.println("Enter the option");
			opt=sc.nextInt();
			switch(opt)
			{
			case 1: System.out.println("enter the element to push in stack:");
					s.push(sc.nextInt());
					break;
			
			case 2: System.out.println(s.pop()+" element removed from the stack ");	
					break;
			case 3:
					System.out.println("enter the element to push in stack:"+s.peek());
					break;
			case 4:
					System.out.println("Stack elements are: ");
					s.display();
					break;
			case 5:	
					System.out.println("program terminated ! ");
					flag=false;
					break;
			default :
					System.out.println("INVALID CHOICE ...!");
					break;
			}
			
		}
		}	
	
	

}
