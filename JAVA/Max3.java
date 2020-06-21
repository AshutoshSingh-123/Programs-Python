import java.util.*;
class Node{
int data;
Node next;
}
class Max3{
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
public void maxNode() {  
        Node current = head;  
        //Initializing max to initial node data  
        int max = head.data;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
             do{  
                 //If current node's data is greater than max  
                 //Then replace value of max with current node's data  
                 if(max < current.data) {  
                     max = current.data;  
                 }  
                 current= current.next;  
                }while(current != head);  
               
            System.out.println("Maximum value node in the list: "+ max);  
        }  
    }  
                  
    public static void main(String[] args) {  
    create();
System.out.println("list is");
display();
Max3 cl = new Max3();
 cl.maxNode();  
  
        }  
    }    