import java.util.Scanner;
import java.util.Arrays;

public class OneDarray7{
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

	   for(int i=0;i<a-1;i++){
		if(arr[i]==arr[i+1]){
		  continue;
		}
		else{
		  System.out.print(arr[i]+" ");}
	   }
	  
	   System.out.print(arr[a-1]);	
	
}}