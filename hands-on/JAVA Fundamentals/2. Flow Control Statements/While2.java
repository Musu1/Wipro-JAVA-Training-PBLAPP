public class While2{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=a;
		int reverse=0;
		while(a>0){
		  int temp=a%10;
		  reverse=(reverse*10)+temp;
		  a=a/10;}
		if(reverse==b){
		  System.out.print(b+" is a palindrome number");}
		else{
		  System.out.print(b+" is not a palindrome number");}
}}