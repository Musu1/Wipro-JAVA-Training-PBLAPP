import java.util.Scanner;

class String9{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the first String");
	   String a=sc.nextLine();
	   System.out.println("Enter the Second string");
	   String b=sc.nextLine();
	   int lena=a.length();
	   int lenb=b.length();
	   int min=lena;
	   int max=lenb;
	   if(lena<lenb){
	      min=lena;
	      max=lenb;}
	   for(int i=0;i<min;i++){
	     System.out.print(a.charAt(i));
	     System.out.print(b.charAt(i));}
	   if(lena!=lenb){
	      int lenn=max-min;
	      for(int i=0;i<lenn;i++){
	         if(lena>lenb){
	           System.out.print(a.charAt(lenn+i));}
		 else{
		   System.out.print(b.charAt(lenn+i));}
	      }
	   }
}}
							
	         