import java.util.*;
class Node{
int data;
Node next;
}
class SLLPrime{
	static Node head=null,tail=null;// head and tail are class variables and are accessible in all the methods
	static Scanner sc=new Scanner(System.in);//sc can be used any where in SLL class
	static void create()
	{
		
		System.out.println("Enter initial range of nodes");
		int n1=sc.nextInt();
		System.out.println("Enter final range of nodes");
                 int n2=sc.nextInt();
             for(int i=n1;i<n2;i++)
		{
		Node temp=new Node();
		
		temp.data=i;
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
static void Find_prime()
{
int n1=sc.nextInt();
int n2=sc.nextInt();
System.out.println("prime numbers are:"); 
for(int i=n1; i<=n2; i++)

        {
           int count = 0;
            for(int j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.println(i + " ");
            }
        }
    }


public static void main(String[]args){
create();
display();

Find_prime();
					

					
}
}