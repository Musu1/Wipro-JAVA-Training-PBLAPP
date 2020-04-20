package test1;

public class Demo2{
	    boolean isPalindrome(String str){
		String rev="";
		str=str.toLowerCase();
		int length=str.length();
		for(int i=length-1;i>=0;i--){
		   rev=rev+str.charAt(i);}
		
		if(str.equals(rev))
		  return true;
		else
		  return false;
	}
}
