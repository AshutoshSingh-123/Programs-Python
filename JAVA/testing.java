import java.util.*;
class testing{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

List<Integer> ls=new ArrayList<>();
String[] s=new String[3];


for(int i=0;i<3;i++){

try{
s[i]=sc.nextLine();
int n=Integer.parseInt(s[i]);
ls.add(n);
}
catch(Exception e){
System.out.println("Enter Number");
i--;
}

}
for(int x:ls)
System.out.print(x+" ");
}
}