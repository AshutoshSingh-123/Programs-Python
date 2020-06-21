import java.util.*;
class Node{
int data;
Node prev, next;
}
class SortList2{
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
public void sortList() {  
        Node current = null, index = null;  
        int temp;  
        //Check whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Current will point to head  
            for(current = head; current.next != null; current = current.next) {  
                //Index will point to node next to current  
                for(index = current.next; index != null; index = index.next) {  
                    //If current's data is greater than index's data, swap the data of current and index  
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                }  
            }  
        }  
    }  
 public static void main(String[] args) {  
 create();
 System.out.println("Original list is");
  display();
SortList2 dList = new SortList2(); 
 dList.sortList();  
          
        //Displaying sorted list  
        System.out.println("Sorted list: ");  
        dList.display();  
    }  
}