import java.util.Scanner;

class String5{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Please enter the string");
	  String str=sc.nextLine();
	  int len=str.length();
	  System.out.println(str.substring(1,len-1));
}}