import java.util.Scanner;

class String10{
	public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter the string");
	   String s=sc.nextLine();
	   System.out.println("Please enter the number");
	   int n=sc.nextInt();
	   int len=s.length();
	   String sub=s.substring(len-n,len);
	   for(int i=0;i<n;i++){
	     System.out.print(sub);
	   }
}}