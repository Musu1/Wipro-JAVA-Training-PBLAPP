import java.util.*;

public class Exception8{
	public static void main(String args[]){
		Person p=new Person();
		Scanner sc=new Scanner(System.in);
		try{
		   int a=Integer.parseInt(args[1]);
		   p.ageValidation(args[0],a);
		}
		    	
		catch(InvalidAgeException e){
	  	   //System.out.println(e.getMessage());
		}
}}

class Person{
	String name;
	int age;

	void ageValidation(String name,int age) throws InvalidAgeException{
	   if(age<18 || age>60){
	      throw new InvalidAgeException();
	   }
	   else{
	      System.out.println("Age is in the range.So person accepted");
	    }
	}
	
}

class InvalidAgeException extends Exception{
	public InvalidAgeException(){
	   super();
	   System.out.println("InvalidAgeException occured");
	   System.out.println("Age out of range.");
	}
}