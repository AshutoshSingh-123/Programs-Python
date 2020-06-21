import java.util.*;
class Node{
int data;
Node prev, next;
}
class DeleteDup2{
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
    void remove_duplicates() {  
        //Node current will point to head  
        Node current=head, index, temp;  
          
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Initially, current will point to head node  
            for(current = head; current != null; current = current.next) {  
                //index will point to node next to current  
                for(index = current.next; index != null; index = index.next) {  
                    if(current.data == index.data) {  
                        //Store the duplicate node in temp  
                        temp = index;  
                        //index's previous node will point to node next to index thus, removes the duplicate node  
                        index.prev.next = index.next;  
                        if(index.next != null)  
                            index.next.prev = index.prev;  
                        //Delete duplicate node by making temp to null  
                        temp = null;  
                    }  
                }  
            }  
        }  
    }  
public static void main(String args[]) 
    { create();
      System.out.println("Linked list is:");
      display();
      DeleteDup2 dd=new DeleteDup2();
      dd.remove_duplicates(); 
      System.out.println("List after deleting duplicates is:");
      display();
     }
}