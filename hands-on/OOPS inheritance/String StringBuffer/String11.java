import java.util.Scanner;

class String11{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter the string");
	   String a=sc.nextLine();
	   System.out.println("Please enter the sub string");
	   String b=sc.nextLine();
	   int len=b.length();
	   int c=0;
	   while(c!=-1){
	   	if(c!=0){
	      	    c=a.indexOf(b,c+len);
		    if(c>0 && c+len<a.length()) {
		    System.out.print(a.charAt(c-1));
		    System.out.print(a.charAt(c+len));}
		}
	        else{
		    c=a.indexOf(b,c);
	            if(c>0 && c+len<a.length() ) {
		    System.out.print(a.charAt(c-1));
		    System.out.print(a.charAt(c+len));}
		}
	   }
}}