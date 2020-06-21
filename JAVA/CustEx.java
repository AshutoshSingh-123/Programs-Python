class tooyoungException extends RuntimeException{
tooyoungException(String s){
super(s);
}
}
class CustEx{
public static void main(String[]args){
try{
int x=Integer.parseInt(args[0]);
