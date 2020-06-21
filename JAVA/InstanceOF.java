import java.util.*;
class Student{}
class Rockstar{}
class Hacker{}
public class InstanceOF{
static String count(ArrayList al){
int a=0,b=0,c=0;
for(int g=0;g<al.size();g++){
Object element=al.get(0);
if(element instanceof Student)
a++;
if(element instanceof Rockstar)
b++;
if(element instanceof Hacker)
c++;
}
String ret=Integer.toString(a)+" "+Integer.toString(b)+" "+Integer.toString(c);
 return ret;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of Objects");
int x=sc.nextInt();
ArrayList al=new ArrayList();
for(int i=0;i<x;i++){
String s=sc.next();
if(s.equals("Student"))
al.add(new Student());
if(s.equals("Rockstar"))
al.add(new Rockstar());
if(s.equals("Hacker"))
al.add(new Hacker());
}
System.out.println(count(al));
}
}
