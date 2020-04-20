public class IfStatement5{
	public static void main(String args[]){
		char a=args[0].charAt(0);
		if(Character.isDigit(a)){
		   System.out.print("Digit");
		}
		else if(Character.isAlphabetic(a)){
		   System.out.print("Alphabet");
		}
		else{
		   System.out.print("Special Character");
}
}}