import java.util.*;
class Node{
int data;
Node next;
}
class SortList3{
	static Node head=null,tail=null;// head and tail are class variables and accessible in all the methods
	static Scanner sc=new Scanner(System.in);//sc can be used any where in SLL class
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
public void sortList() {  
//Current will point to head  
Node current = head, index = null;  
int temp;  
if(head == null) {  
System.out.println("List is empty");  
}  
else {  
do{  
 
index = current.next;  
while(index != head) {  

if(current.data > index.data) {  
temp =current.data;  
current.data= index.data;  
index.data = temp;  
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
SortList3 cl = new SortList3();
cl.sortList();  
//Displaying sorted list  
System.out.println("Sorted list: ");  
cl.display();  
}  
}    