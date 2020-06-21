import java.util.*;
class Node
{
	int data;
	Node link;
}
class Stack_L
{
	static Node top=null;
	static Scanner sc=new Scanner(System.in);
	static void push()
	{
			Node t=new Node();
			System.out.println("enter an element to push");
			t.data=sc.nextInt();
			if(top==null)
			{
				top=t;
				top.link=null;
			}
			else
			{
				t.link=top;
				top=t;
			}
	}
		
	static void pop()
	{
		if(top==null)
			System.out.println("Stack is empty");
		else
		{
			Node t=top;
			top=top.link;
			t.link=null;
			System.out.println(t.data+" is popped out");
			t=null;
		}
	}
	static void display()
	{
		if(top==null)
			System.out.println("Stack is empty");
		else
		{
				for(Node t=top;t!=null;t=t.link)
					System.out.println(t.data);
		}
	}
	public static void main(String args[])
	{
		int ch;
		while(true)
		{
		System.out.println("Enter choice \n 1.Push \n 2. Pop\n 3. Display \n 4. Exit ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: push();
					break;
			case 2: pop();
					break;
			case 3: display();
					break;
			case 4:System.exit(0);
					break;
			default: System.out.println("Invalid choice");
					break;
		}
	}
}
}
			