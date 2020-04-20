import java.util.Scanner;

public class OneDarray8{
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
		
           int flag=0;
	   int sum1=0;
	   for(int i=0;i<a;i++){
		if(arr[i]==6){
		  sum1=sum1+6;
		  flag=1;}
		if(flag==1 && arr[i]!=7 && arr[i]!=6){
		  sum1=sum1+arr[i];}
		if(arr[i]==7 && flag==1){
		  sum1=sum1+7;
		  flag=2;}
	   }
	  
	  if(flag==2){
		System.out.println(sum-sum1);
	  }
	  else{
		System.out.println(sum);}
	   	
	
}}