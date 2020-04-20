import java.util.*;

public class question7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first String");
		String s1=sc.next();
		System.out.println("Please enter second String");
		String s2=sc.next();	
		ArrayList<String> l=stringss(s1,s2);
		System.out.println(l);
	}
	
	public static ArrayList<String> stringss(String s1,String s2){
		ArrayList<String> l=new ArrayList<String>();

		StringBuilder sb=new StringBuilder();
		int a=s2.length();
		for(int i=1;i<s1.length();i=i+2){
			sb.append(s2);
			sb.append(s1.charAt(i));
		}
		l.add(sb.toString());

		
		int occur=s1.split(s2,-1).length-1;
		if(occur>1){
			l.add(s1.substring(0,s1.lastIndexOf(s2))+new StringBuilder(s2).reverse());
		}
		else{
			l.add(s1+s2);
		}

		if(occur>1){
			l.add(s1.substring(0,s1.indexOf(s2))+s1.substring(s1.indexOf(s2)+s2.length(),s1.length()));
		}
		else{
			l.add(s1);
		}


		int partition=s2.length()%2==0?s2.length()/2:s2.length()/2+1;
		l.add(s2.substring(0,partition)+s1+s2.substring(partition,s2.length()));

		sb=new StringBuilder();
		for(int i=0;i<s1.length();i++){
			if(s2.indexOf(s1.charAt(i))!=-1)
				sb.append('*');
			else
				sb.append(s1.charAt(i));
		}
		l.add(sb.toString());

		return l;
	}
}


			