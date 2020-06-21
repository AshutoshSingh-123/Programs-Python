import java.io.*;
import java.util.*;
import java.text.*;
//import java.math.*;
import java.util.regex.*;

class Solution extends Thread {
 

public void run(){
int x1=2;
int [] a=new int[x1];
        a[0]=8;
        a[1]=1000;
        for(int g=0;g<x1;g++){
        int count=0;
        
        for(int a1=0;a1<=a[g];a1++){
        for(int b=0;b<=a[g];b++){
        for(int c=0;c<=a[g];c++){
            double d=a1*(a1*(8*a1+15)+6)-27*b*b*c;
            //Math.cbrt(a1+b*Math.sqrt(c))+Math.cbrt(a1-b*Math.sqrt(c))
            int f=a1+b+c;
          if(f<=a[g])  {
                    {if(d==1.0)
                count++;
            }
        }
    }
}}
//System.out.println(count);
      }
}
}
class Solution1{
        
    public static void main(String[] args) throws Exception {
        

       Solution t=new Solution();
                t.start();
t.join();
long start = System.currentTimeMillis(); 
long end = System.currentTimeMillis(); 
        //System.out.println("Counting to 10000000 takes " + 
                                    //(end - start) + "ms"); 
    }
}