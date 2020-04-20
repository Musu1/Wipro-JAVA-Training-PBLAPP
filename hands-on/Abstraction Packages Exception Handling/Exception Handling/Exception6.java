import java.util.*;

public class Exception6{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  
	  for(int i=0;i<2;i++){
	    String name="";
	    int a=0;
	    int b=0;
	    int c=0;
	    
 	    try{
	        System.out.println("Please enter name of the child");
	        name=sc.next();
		System.out.println("Please enter marks in subject a");
		if(sc.hasNextInt()){
	           a=sc.nextInt();
	        }
	        else{
	           throw new NumberFormatException();
	        }
		System.out.println("Please enter marks in subject b");
	        if(sc.hasNextInt()){
	           b=sc.nextInt();
	        }
	        else{
	           throw new NumberFormatException();
	        }
		System.out.println("Please enter marks in subject c");
		if(sc.hasNextInt()){
	           c=sc.nextInt();
	        }
	        else{
	           throw new NumberFormatException();
	        }
	 
		if(a<0){
	            throw new NegativeValuesException();
	    	}
		if(a>100){
	            throw new ValuesOutofRangeException();	
		}

		if(b<0){
	            throw new NegativeValuesException();
	    	}
		if(b>100){
	            throw new ValuesOutofRangeException();	
		}

		if(c<0){
	            throw new NegativeValuesException();
	    	}
		if(c>100){
	            throw new ValuesOutofRangeException();	
		}
              }
	
	     catch(NumberFormatException e){
		  	System.out.println(e.getMessage());
	     }
	     catch(NegativeValuesException e){
		        System.out.println(e.getMessage());
	     }
	     catch(ValuesOutofRangeException e){
			System.out.println(e.getMessage());
	     }
	
	     System.out.println("Name: " + name);
	     System.out.println("Marks of subject A: " + a);
             System.out.println("Marks of subject B: " + b);
             System.out.println("Marks of subject C: " + c);
	   }

}}


class NegativeValuesException extends Exception{
	public NegativeValuesException(){
	    super();
	    System.out.println("Negative value exception occurred");
	}
}

class ValuesOutofRangeException extends Exception{
	public ValuesOutofRangeException(){
	    super();
	    System.out.println("Values Out of Range Exception occurred");
	}
}