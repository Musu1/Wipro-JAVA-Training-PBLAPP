import java.util.*;

public class Set3{
	public static void main(String args[]){
		TreeSet<String> s=new TreeSet<>();
		s.add("Muskan");
		s.add("Sonali");
		s.add("Khushboo");

		String a="Khushboo";
		boolean result=false;

		Iterator<String> i=s.iterator();

		while(i.hasNext()){
			if(i.next().equals(a)){
				result=true;
				break;
			}
		}

		if(result){
			System.out.println(a+" exists in collection");
		}
		else{
			System.out.println(a+" does not exists");
		}
		
		NavigableSet<String> set = s.descendingSet();
		Iterator<String> ii=set.iterator();

		while(ii.hasNext()){	
			System.out.println(ii.next());
		}
}}