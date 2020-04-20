import java.util.Scanner;

class String6{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Please enter the string");
	  String a=sc.nextLine();
	  System.out.println("Please enter the string");
	  String b=sc.nextLine();
	  int lena=a.length();
	  int lenb=b.length();
	  if(lena>lenb){
	    System.out.println(b+a+b);
	  }
	  else{
	    System.out.println(a+b+a);
	  }
}
}