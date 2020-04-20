import java.util.Scanner;

public class OneDarray5{
	public static void main(String args[]){
	   System.out.print("Print the size of array");
	   Scanner sc=new Scanner(System.in);

	   int a=sc.nextInt();
	   int[] arr=new int[a];

	   System.out.println("Please enter "+a+" values for the array");
           
 	   for(int i=0;i<a;i++){
		arr[i]=sc.nextInt();
	   }
	   int largest1=arr[0];
	   int largest2=arr[1];
	   int min1=arr[0];
	   int min2=arr[1];

	   if(largest1<largest2){
	       int temp=largest1;
	       largest1=largest2;
               largest2=temp;}

	   if(min1>min2){
		int temp=min1;
		min1=min2;
		min2=temp;}

	   for(int i=2;i<a;i++){
		if(arr[i]>largest1){
		   largest2=largest1;
		   largest1=arr[i];}
		else if(arr[i]>largest2){
		   largest2=arr[i];}

		if(arr[i]<min1){
		   min2=min1;
		   min1=arr[i];}
		else if(arr[i]<min2){
		   min2=arr[i];}
	   }

	  System.out.println("First Maximum value of array is "+largest1);
	  System.out.println("Second Maximum value of array is "+largest2);
	  System.out.println("First Minimum value of array is "+min1);
	  System.out.println("Second Minimum value of array is "+min2);
	   	
	
}}