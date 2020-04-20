import java.util.*;

public class Set2{
	public static void main(String args[]){
		HashSet<String> set=new HashSet<>();
		set.add("Muskan");
		set.add("Sonali");
		set.add("Khushboo");
		
		Iterator<String> i=set.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}