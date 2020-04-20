public class IfStatement7{
	public static void main(String args[]){
		char a=args[0].charAt(0);
		if(Character.isUpperCase(a)){
		   System.out.print(a+"->"+Character.toLowerCase(a));
		}
		else{
		   System.out.print(a+"->"+Character.toUpperCase(a));
		}
}}