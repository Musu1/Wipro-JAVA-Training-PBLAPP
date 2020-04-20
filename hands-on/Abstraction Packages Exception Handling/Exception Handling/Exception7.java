import java.util.*;

public class Exception7{
	public static void main(String args[]){
		UserRegistration u=new UserRegistration();
		Scanner sc=new Scanner(System.in);
		try{
		   System.out.println("Please enter the user name");
		   String N=sc.next();
		   System.out.println("Please enter the user's country");
		   String C=sc.next();
		   u.registerUser(N,C);
		}
		    	
		catch(InvalidCountryException e){
	  	   //System.out.println(e.getMessage());
		}
}}

class UserRegistration{
	String username;
	String userCountry;

	void registerUser(String username,String userCountry) throws InvalidCountryException{
	   if(!userCountry.equals("India")){
	      throw new InvalidCountryException();
	   }
	   else{
	      System.out.println("User registration done successfully");
	    }
	}
	
}

class InvalidCountryException extends Exception{
	public InvalidCountryException(){
	   super();
	   System.out.println("InvalidCountryException occured");
	   System.out.println("User Outside India cannot be registered");
	}
}