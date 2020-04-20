import java.util.Scanner;

public class Wrapper3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a integer");
		int input=sc.nextInt();
		String output=String.format("%8s",Integer.toBinaryString(input)).replace(' ','0');
	        System.out.println(output);
}}