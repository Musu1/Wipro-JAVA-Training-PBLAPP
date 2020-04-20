public class Wrapper2{
	public static void main(String args[]){
	  int num=Integer.parseInt(args[0]);
	  System.out.println("Given number :"+num);
	  System.out.println("Binary Equivalent: "+Integer.toBinaryString(num));
	  System.out.println("Octal equivalent: "+Integer.toOctalString(num));
	  System.out.println("Hexadecimal equivalent: "+Integer.toHexString(num));
}}