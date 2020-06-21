import java.util.*;
class x  {
int i=0;
public synchronized void run(int x){
for(int j=0;j<5;j++){

i=i+j+x;
}
//System.out.println(i);
//return i;
}
}

class y extends Thread{
public void run(){
x x1=new x();
//x1.start();
x1.run(5);
System.out.println(x1.i);

}
}

class synDemo{
public static void main(String[] args) throws Exception{
x x1=new x();

x1.run(10);

System.out.println("main"+x1.i);
y y1=new y();
y1.start();
y1.join();
}
}