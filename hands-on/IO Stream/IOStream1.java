import java.io.*;
import java.util.*;

public class IOStream1{
	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		String name=sc.nextLine();
		System.out.println("Enter the character");
		char c=sc.nextLine().charAt(0);

		File file=new File(name);
		int count=0;
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		char ch;
		int a=0;
		while(a!=-1){
			a=br.read();
			ch=(char)a;
			if(ch==c){
			   count++;
			}
		}
		
		System.out.println("File "+name+" has "+count+" instances of letter "+c);
		br.close();
}}