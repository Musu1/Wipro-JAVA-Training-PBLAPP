import java.util.Scanner;

public class OneDarray4{
	public static void main(String args[]){
	   System.out.print("Print the size of array");
	   Scanner sc=new Scanner(System.in);

	   int a=sc.nextInt();
	   int[] arr=new int[a];

	   System.out.println("Please enter "+a+" ascii values for the array\n");
           
 	   for(int i=0;i<a;i++){
		arr[i]=sc.nextInt();
	   }
	   	
	   for(int i=0;i<a;i++){
		System.out.print((char)arr[i]+" ");
	   }
}}