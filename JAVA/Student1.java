class Student1{
String name;
int rn;
Student1(String name, int rn){
this.name=name;
this.rn=rn;
}
public void m1(){
int m=0;
m=m+rn;
System.out.println(m);
}
public static void main(String[]args){
Student1 s1=new Student1("a",1);
Student1 s2=new Student1("aa",2);
System.out.println(s1.name);
s1.m1();
s2.m1();
}
}