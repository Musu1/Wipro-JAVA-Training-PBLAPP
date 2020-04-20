import java.util.Scanner;

public class OneDarray9{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
       
	   System.out.println("Print the row of array");
	   int r=sc.nextInt();
	   System.out.println("Print the column of array");
	   int c=sc.nextInt();

	   int[][] arr=new int[r][c];
	   int total=r*c;
	   System.out.println("Please enter "+total+" values for the array");
           
 	   for(int i=0;i<r;i++){
	     for(int j=0;j<c;j++){
		arr[i][j]=sc.nextInt();
	   }}
	   

	   for(int i=r-1;i>=0;i--){
	     for(int j=c-1;j>=0;j--){
		System.out.print(arr[i][j]+" ");
	   }}
	   	
	
}}