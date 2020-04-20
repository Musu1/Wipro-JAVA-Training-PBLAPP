import java.util.Scanner;

class String3{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Please enter the string");
	  String str1=sc.nextLine();
	  int n=str1.length();
	  String rev=str1.substring(0,2);
	  String str="";
	  for(int i=0;i<n;i++){
	    str=str+rev;
	  }
	  System.out.println(str);
	}}