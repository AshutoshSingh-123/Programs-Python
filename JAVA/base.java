class base{
 int i=10;
base(){
System.out.println("constructor");
}
{
m1();
System.out.println("first static block");
}
public static void main(String[]args){
//m1();
base b=new base();
System.out.println("main method");

}
public  void m1(){
System.out.println(j);
}
{
System.out.println("second static block");
}
 int j=20;
}