import java.util.Arrays;
import java.util.Scanner;

public class OneDarray6{
	public static void main(String args[]){
	   System.out.print("Print the size of array");
	   Scanner sc=new Scanner(System.in);

	   int a=sc.nextInt();
	   int[] arr=new int[a];

	   System.out.println("Please enter "+a+" values for the array");
           
 	   for(int i=0;i<a;i++){
		arr[i]=sc.nextInt();
	   }
	   
	   Arrays.sort(arr);
	   for(int i=0;i<a;i++){
		  System.out.println(arr[i]+" ");
	   }	
	
}}