import java.util.*;
class Node 
{ 
    int data; 
    Node next; 
} 
class Maximumele
{ 
    static Node head=null,tail=null; 
    static Scanner sc=new Scanner(System.in);
    static void create() 
    { 
        System.out.println("Enter total number of Nodes");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
	Node temp=new Node();
	System.out.println("Enter data");
	temp.data=sc.nextInt();
	temp.next=null;
	if(head==null)
	head=tail=temp;
	else
	{
	 tail.next=temp;
	 tail=temp;
	}
         }             
    }
    static void display()
    {
	if(head==null)
	System.out.println("List is empty");
	else
	{
	 Node temp;
	 temp=head;
	 while(temp!=null)
	 {
 	  System.out.print(temp.data+" ");
	  temp=temp.next;
	 }
	 System.out.println();
	}
     } 
    static int maximumNode() {   
        Node current = head;  
        int max;  
        if(head == null) {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else {  
            max = head.data;  
            while(current != null) {  
                if(current.data > max)   
                    max = current.data;  
                current = current.next;  
            }  
        }  
        return max;  
    }  
    public static void main(String args[])
    {
      create();
      System.out.println("Linked list is:");
      display();
      int max=maximumNode();
      System.out.println("The largest element is:"+max);
     }
}