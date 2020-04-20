public class IfStatement6{
	public static void main(String args[]){
		String a=args[0];
		int b=Integer.parseInt(args[1]);
		if(a.equals("Female")&& b>=1 && b<=58){
		   System.out.print("8.2%");
		}
		else if(a.equals("Female")&& b>=59 && b<=100){
		   System.out.print("9.2%");
		}
		else if(a.equals("Male")&& b>=1 && b<=58){
		   System.out.print("8.4%");
		}
		else if(a.equals("Male")&& b>=59 && b<=100){
		  System.out.print("10.5%");
		}
}}