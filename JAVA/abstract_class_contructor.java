public abstract class abstract_class_contructor {
String s;
int x;
abstract_class_contructor(String s,int x){
	this.s=s;
	this.x=x;
}
}
class AA extends abstract_class_contructor{
	int y;
	AA(String s,int x,int y){
		super(s,x);
		this.y=y;
	}
	public static void main(String[]args) {
		AA a=new AA("aa",1,2);
		System.out.println(a.x);
	}
}