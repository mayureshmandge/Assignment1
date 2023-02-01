package humancloud;
import java.util.Scanner;
public class myArray {
		static Scanner sc=new Scanner(System.in);
		static   int []arr;
		public  void display()
		{
			System.out.println("array elements are:");
			
			System.out.print("[");
			for(int i=0;i<arr.length;i++)
			System.out.print(+arr[i]+" ");
			System.out.print("]");
			System.out.println();
			
		}
		
		public  void create()
		{
			int n;
			System.out.println("Enter the size of an array: ");
			n=sc.nextInt();
			arr=new int[n];
			
			System.out.println("Enter the array Elements:");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		public  int search(int key)
		{
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==key)
					return i;
				
			}
			return 0;
		}
		public  void delete()
		{
			int [] newarray= new int[arr.length-1];
			System.out.println("enter the element you weant to delete");
			int value=sc.nextInt();
			int pos=search(value);
			for(int i=0,k=0;i<arr.length;i++)
			{
				if(i==pos)
					continue;
				newarray[k++]=arr[i];
			}
			System.out.println("Element delete succefully:");
				arr=newarray;
		}
		public  void sort()
		{
			int i,j,temp;
			for(i=0;i<arr.length-1;i++)
			{
				for(j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					
				}
			}
			System.out.println("array is sorted:");
			
		}
	public static void main(String[] args) {
		
			myArray aa=new myArray();
			int opt;
			boolean flag=true;
			while(flag)
			{
				System.out.println("---------------------------------");
				System.out.println("1. CREATE");
				System.out.println("2. DISPLAY");
				System.out.println("3. SEARCH");
				System.out.println("4. DELETE");
				System.out.println("5. SORT");
				System.out.println("6. EXIT");
				System.out.println("Enter your Choice:");
				 opt=sc.nextInt();
				switch(opt)
				{
				case 1:	
						aa.create();
						break;
				case 2:	
						aa.display();
						break;
				case 3:	
						System.out.println("enter the element want to search");
						System.out.println("Found at position : "+aa.search(sc.nextInt()));
						break;
				case 4:	
						aa.delete();
						break;
				case 5:	
						aa.sort();
						break;
				case 6:	
						System.out.println("Program terminated");
						flag=false;
						break;
				default :	
						System.out.println("INVALID CHOICE ...!");
						break;
				}
			}
			
			
			
					
		}

}

