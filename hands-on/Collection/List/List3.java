import java.util.*;

public class List3{
	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<>();
		list.add("I");
		list.add("am");
		list.add("Muskan");
		list.add("Agarwal");
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> i = list.iterator();
		
		while (i.hasNext())
			System.out.println(i.next());
	}
}