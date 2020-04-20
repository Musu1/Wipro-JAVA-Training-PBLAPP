import java.io.*;
import java.util.*;

public class IOStream2{
	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input film name");
		String input=sc.nextLine();
		System.out.println("Enter the output film name");
		String output=sc.nextLine();
		
		File in=new File(input);
		File out=new File(output);

		BufferedReader br=new BufferedReader(new FileReader(in));
		BufferedWriter bw=new BufferedWriter(new FileWriter(out));
		
		int a;
		while((a=br.read()) != -1){
			bw.write(a);
		};

		br.close();
		bw.close();
}}