import java.util.Scanner;

class String7{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Please enter the string");
	  String str=sc.nextLine();
	  int len=str.length();
	  if(str.charAt(0)=='x' && str.charAt(len-1)=='x'){
	    System.out.println(str.substring(1,len-1));
	  }
	  else if(str.charAt(0)=='x' && str.charAt(len-1)!='x'){
	    System.out.println(str.substring(1,len));
	  }
	  else if(str.charAt(0)!='x' && str.charAt(len-1)=='x'){
	    System.out.println(str.substring(0,len-1));
	  }
	  else{
	    System.out.println(str);
	  }
}}