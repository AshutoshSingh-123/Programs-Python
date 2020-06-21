public class Parent_class_Object_not_Created {
	Parent_class_Object_not_Created(){
		System.out.println(this.hashCode());
	}
}
class X extends Parent_class_Object_not_Created{
	X(){
		System.out.println(this.hashCode());
	}
}
class T{
	public static void main(String[]args) {
		X x=new X();
		System.out.println(x.hashCode());
	}
}