import java.util.Scanner;

public class Exception1{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter an integer");
	  String s=sc.nextLine();
	  try{
	   int x=Integer.parseInt(s);
	   System.out.println("The sqaure value is "+x*x);
	   System.out.println("The work has been done successfully");
	  }
	  catch(NumberFormatException e){
	    System.out.println("Entered input is not a valid format for an integer");
	  }
}}