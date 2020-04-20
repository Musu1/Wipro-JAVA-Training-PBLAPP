public class IfStatement4{
	public static void main(String args[]){
		char a=args[0].charAt(0);
		char b=args[1].charAt(0);
		if(a<b){
		   System.out.print(a+","+b);
		}
		else{
		   System.out.print(b+","+a);
		}
}}