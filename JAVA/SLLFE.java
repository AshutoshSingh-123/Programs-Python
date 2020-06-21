import java.util.*;
class Node{
int data;
Node next;
}
class SLLFE{
	static Node head=null,tail=null;// head and tail are class variables and are accessible in all the methods
	static Scanner sc=new Scanner(System.in);//sc can be used any where in SLL class
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
		if(head==null)
			head=tail=temp;
		else{
			tail.next=temp;
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
 //Checks whether the value x is present in linked list 
    public boolean search(Node head, int x) 
    { 
        Node current = head;    //Initialize current 
        while (current != null) 
        { 
            if (current.data == x) 
                return true;    //data found 
            current = current.next; 
        } 
        return false;    //data not found 
    } 
public static void main(String args[]){	
	
	create();
	display();
	int x;
         
{
	
   System.out.println("enter the value of 'x'");
        x=sc.nextInt();{
     if(true){
 
            System.out.println("Yes");}
 
       

 else
            System.out.println("No"); 

}
}
}
}	