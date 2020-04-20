import java.util.Scanner;

class String4{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Please enter the string");
	  String str1=sc.nextLine();
	  int len=str1.length();
	  if(len%2==0){
	    System.out.println(str1.substring(0,len/2));
	  }
	  else{
	    System.out.println("null");
	  }
}}