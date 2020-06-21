import java.util.*;
class Node{
int data;
Node next;
}
class ReverseLinkedList{
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
	 Node reverse(Node node) { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
  
    // prints content of double linked list 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) { 
         create();
    display();
ReverseLinkedList list = new ReverseLinkedList();
list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
} 
  