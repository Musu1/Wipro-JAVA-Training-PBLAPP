import java.util.Scanner;

public class Exception9{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  try{
	    System.out.println("Enter first number");
	    int a=sc.nextInt();
	    System.out.println("Enter second number");
	    int b=sc.nextInt();
	    int q=a/b;
	    System.out.println("The quotient of "+a+"/"+b+"="+q);
	  }
	  catch(ArithmeticException e){
	    System.out.println(e.getMessage()+" caught");
	  }
	  finally{
	    System.out.println("Inside finally block");
	  }
}}