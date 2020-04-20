import java.util.Scanner;

class String2{
	public static void main(String args[]){
	  String str1,str2;
	  System.out.println("Please enter the first string");
	  Scanner sc=new Scanner(System.in);
	  str1=sc.nextLine();
	  System.out.println("Please enter the second string");
	  str2=sc.nextLine();
	  int len1=str1.length();
	  int len2=str2.length();
	  str1=str1.toLowerCase();
	  str2=str2.toLowerCase();
	  if(str1.charAt(len1-1)==str2.charAt(0)){
	     for(int i=1;i<len2;i++){
	        str1=str1+str2.charAt(i);
	  }
	     System.out.println(str1);	
          }
	  else{
	    System.out.println(str1+" "+str2);
	  }
}}