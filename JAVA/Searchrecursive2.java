import java.util.*;
class Node{
int data;
Node prev, next;
}
class Searchrecursive2

{
	static Node head=null,tail=null;
	static Scanner sc=new Scanner(System.in);
	static void create()
	{
		
		System.out.println("Enter total number of nodes");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		Node temp=new Node();
		System.out.println("Enter data");
		temp.data=sc.nextInt();
		temp.next=null;
                 temp.prev=null;
		if(head==null)
			head=tail=temp;
		else{
			tail.next=temp;
                        temp.prev=tail;
		tail=temp;}
		}
	}
	static void display()
	{
		if(head==null)
			System.out.println("List is Empty");
		else 
		{
		Node temp;
		temp=head;
		while(temp!=null)
			{
				System.out.print(temp.data+"  ");
				temp=temp.next;
			}
			System.out.println();
		}
	}

    public boolean search(Node head, int x) 
    { 
        if (head == null) 
            return false;  
        if (head.data == x) 
            return true; 
        return search(head.next, x); 
    } 
    public static void main(String args[]) 
    { create();
      System.out.println("Linked list is:");
      display();
      System.out.println("Enter the element which is to be searched:");
      int x=sc.nextInt();
      Searchrecursive2 ll=new Searchrecursive2();
      if (ll.search(ll.head, x)) 
          System.out.println("The element is present"); 
      else
          System.out.println("The element is absent"); 
     }
}