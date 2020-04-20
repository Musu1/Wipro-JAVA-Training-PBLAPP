import java.util.Scanner;

public class OneDarray10{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
       
	   System.out.println("Print the row of array");
	   int r=sc.nextInt();
	   System.out.println("Print the column of array");
	   int c=sc.nextInt();

	   int[][] arr=new int[r][c];
	   int total=r*c;
	   System.out.println("Please enter "+total+" values for the array");
           
	   int max=0;
 	   for(int i=0;i<r;i++){
	     for(int j=0;j<c;j++){
		arr[i][j]=sc.nextInt();
		if(max<arr[i][j]){
			max=arr[i][j];}
	   }}
	  
	System.out.print("The biggest number in the given array is "+max);	
}}