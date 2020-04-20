public class IfStatement1{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		if(a>0){
		   System.out.print("The number is positive");
		}
		else if(a<0){
		   System.out.print("The number is negative");
		}
		else{
		   System.out.print("The number is zero");
		}
}}