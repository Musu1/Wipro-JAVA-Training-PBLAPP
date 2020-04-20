import java.util.Scanner;

public class OneDarray3{
	public static void main(String args[]){
	   System.out.print("Print the size of array");
	   Scanner sc=new Scanner(System.in);

	   int a=sc.nextInt();
	   int[] arr=new int[a];

	   System.out.println("Please enter "+a+" values for the array");
           
 	   for(int i=0;i<a;i++){
		arr[i]=sc.nextInt();
	   }
	   
	   System.out.println("Enter the number you want to find");
	   int num=sc.nextInt();
		
           int flag=0;

	   for(int i=0;i<a;i++){
		if(arr[i]==num){
		  System.out.println(i);
		  flag=1;	}
	   }
	  
	  if(flag==0){
		System.out.println("-1");
	  }
	   	
	
}}