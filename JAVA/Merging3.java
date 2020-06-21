import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
class LinkedL
{
	Node head;
	Node tail;
}
public class Merging3
{
	static LinkedL l1=new LinkedL();
	static LinkedL l2=new LinkedL();
	static Scanner sc=new Scanner(System.in);
	public static void create()
	{ 
		l1.head=null;
		l1.tail=null;
		l2.head=null;
		l2.tail=null;
		System.out.println("Enter total number of nodes of List 1");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			Node temp1=new Node();
			System.out.println("Enter data");
			temp1.data=sc.nextInt();
			temp1.next=null;
			if(l1.head==null)
				l1.head=l1.tail=temp1;
			else
			{
				l1.tail.next=temp1;
				l1.tail=temp1;
			}
			l1.tail.next=l1.head;
		}
		System.out.println("List 1:");
		display(l1.head);
		System.out.println("Enter total number of nodes of List 2");
		int n2=sc.nextInt();
		for(int i=0;i<n2;i++)
		{
			Node temp2=new Node();
			System.out.println("Enter data");
			temp2.data=sc.nextInt();
			temp2.next=null;
			if(l2.head==null)
				l2.head=l2.tail=temp2;
			else
			{
				l2.tail.next=temp2;
				l2.tail=temp2;
			}
			l2.tail.next=l2.head;
		}
		System.out.println("List 2:");
		display(l2.head);
		
	}
	static void display(Node head)
	{
		if(head==null)
			System.out.println("List is Empty");
		else 
		{
		Node temp;
		temp=head;
		do
			{
				System.out.print(temp.data+"  ");
				temp=temp.next;
			}while(temp.next!=head.next);
		System.out.println("");
		}
	}
	static void merge(Node head1, Node head2) 
	{
        Node tail = head1;
        do
        {
            tail = tail.next;
        }while(tail.next != head1);
        tail.next = head2;
        tail = head2;
        do
        {
            tail = tail.next;
        }while(tail.next != head2);
        tail.next = head1;
        
    }
	public static void main(String[] args) 
	{
		create();
		merge(l1.head,l2.head);
		System.out.println("List after merging");
		display(l1.head);
	}
}