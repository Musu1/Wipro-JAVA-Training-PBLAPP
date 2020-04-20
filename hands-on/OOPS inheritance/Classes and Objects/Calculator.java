import java.util.Scanner;
import java.lang.*;

class Calculator{
	static void powerInt(int num1,int num2){
	  System.out.println("The volume is "+(Math.pow(num1,num2)));
	}
	static void powerDouble(double num1,int num2){
	  System.out.println("The volume is "+(Math.pow(num1,num2)));
	}
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter the Integer num1");
	   int num1=sc.nextInt();
	   System.out.println("Please enter the Integer num2");
	   int num2=sc.nextInt();
	   System.out.println("Please enter the double num1");
	   double num1d=sc.nextDouble();
	   powerInt(num1,num2);
	   powerDouble(num1d,num2);
}
}	  

