import java.util.*;
class Binary
{
public static void main(String args[])
{
int mid,beg=0,end=9,flag=0;
int a[]=new int[10];
Scanner bg=new Scanner(System.in);
System.out.println("enter the array in ascending order");
for(int i=0;i<=9;i++)
a[i]=bg.nextInt();
System.out.println("enter the number that you wanna search");
int k=bg.nextInt();
do
{
mid =(beg+end)/2;
if(k==a[mid])
{
flag=1;
break;
}
else if (k>a[mid])
beg=mid+1;
else
end=mid-1;
}while(mid>0);
if(flag==1)
System.out.println("the key is found");
else if(flag==0)
System.out.println("not found");
}
}
