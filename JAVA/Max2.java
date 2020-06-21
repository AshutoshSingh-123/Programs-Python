import java.util.*;
class Node{
int data;
Node prev, next;
}
class Max2{
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
public int maximumNode() {  
        //Node current will point to head  
        Node current = head;  
        int max;  
          
        //Checks if list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else {  
            //Initially, max will store the value of head's data  
            max = head.data;  
            //If value of max is lesser than current's data  
            //Then, replace value of max with current node's data  
            while(current != null) {  
                if(current.data > max)   
                    max = current.data;  
                current = current.next;  
            }  
        }  
        return max;  
    }  
      
    public static void main(String[] args) {  
     create();
    System.out.println("list is");
    display();
Max2 dList = new Max2(); 
 System.out.println("Maximum value node in the list: "+ dList.maximumNode());  
    }  
}  