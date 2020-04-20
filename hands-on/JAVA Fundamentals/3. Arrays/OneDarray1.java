import java.util.Scanner;

public class OneDarray1{
	public static void main(String args[]){
	   System.out.print("Print the size of array");
	   Scanner sc=new Scanner(System.in);

	   int a=sc.nextInt();
	   int[] arr=new int[a];

	   System.out.println("Please enter "+a+" values for the array");
	   
           int sum=0;
 	   for(int i=0;i<a;i++){
		arr[i]=sc.nextInt();
		sum=sum+arr[i];
	   }
	  System.out.println("Sum of the values are "+sum);
	  System.out.println("Average of the values are "+(sum/a));
	   	
	
}}