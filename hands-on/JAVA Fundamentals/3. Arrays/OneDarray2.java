import java.util.Scanner;

public class OneDarray2{
	public static void main(String args[]){
	   System.out.print("Print the size of array");
	   Scanner sc=new Scanner(System.in);

	   int a=sc.nextInt();
	   int[] arr=new int[a];

	   System.out.println("Please enter "+a+" values for the array");
	   int max=0;
           
 	   for(int i=0;i<a;i++){
		arr[i]=sc.nextInt();
	   }
	   int min=arr[0];

	   for(int i=0;i<a;i++){
		if(min>arr[i]){
		   min=arr[i];}
		if(max<arr[i]){
		   max=arr[i];}
	   }

	  System.out.println("Minimum value of array is "+min);
	  System.out.println("Maximum value of array is "+max);
	   	
	
}}