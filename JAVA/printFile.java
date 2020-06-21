import java.io.*;
class printFile{
public static void main(String[]args) throws IOException{
PrintWriter pw=new PrintWriter("abc.text");
pw.println("Hello");
}
}