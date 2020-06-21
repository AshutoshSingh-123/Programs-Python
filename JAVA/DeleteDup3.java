import java.util.*;
class Node{
int data;
Node next;
}
class DeleteDup3{
	static Node head=null,tail=null;
	static Scanner sc=new Scanner(System.in);
	static void create()
	{
		
		System.out.println("Enter total number of nodes");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" data values");
		for(int i=0;i<n;i++)
		{
		Node temp=new Node();
		
		temp.data=sc.nextInt();
		
		if(head==null)
			head=tail=temp;
		else{
			tail.next=temp;
		tail=temp;}
		tail.next=head;
		}
	}
	static void display()
	{
		if(head==null)
			System.out.println("List is Empty");
		else 
		{
		Node temp=head;
		do
		{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}while(temp!=head);
		System.out.println();
		
		}
	}
		
	static void Ins_Begin()
	{
		Node temp=new Node();
		System.out.println("Enter data");
		temp.data=sc.nextInt();
			if(head==null)
			head=tail=temp;
			else
			{
			temp.next=head;
			head=temp;
			}
			tail.next=head;
	}
public void removeDuplicate() {  
//Current will point to head  
Node current = head, index = null, temp = null;  
if(head == null) {  
System.out.println("List is empty");  
}  
else {  
do{  

temp = current;  
//Index will point to node next to current  
index = current.next;  
while(index != head) {  
//If current node is equal to index data  
if(current.data == index.data) {  

temp.next = index.next;  
}  
else {  
//Temp will point to previous node of index.  
temp = index;  
}  
index= index.next;  
}  
current =current.next;  
}while(current.next != head);   
}  
}  
public static void main(String args[]){	
	
	create();
System.out.println("list is");
	display();
DeleteDup3 cl = new DeleteDup3();  
cl.removeDuplicate();  
System.out.println("List after removing duplicates: ");  
cl.display();  
}  
}  