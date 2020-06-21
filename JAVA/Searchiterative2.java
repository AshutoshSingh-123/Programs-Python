import java.util.*;
class Node{
int data;
Node prev, next;
}
class Searchiterative2
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
       void searchNode(int x) {  
        int i = 1;  
        boolean flag = false;  
        //Node current will point to head  
        Node current = head;  
          
        //Checks whether the list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Compare x to be searched with each node in the list  
            if(current.data == x) {  
                flag = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(flag)  
             System.out.println("Node is present in the list at the position : " + i);  
        else  
             System.out.println("Node is not present in the list");  
    }  
      
    public static void main(String[] args) { 
create();
      System.out.println("Linked list is:");
      display();
      System.out.println("Enter the element which is to be searched:");
      int x=sc.nextInt();
Searchiterative2 dList = new Searchiterative2();  
dList.searchNode(x); }
}
