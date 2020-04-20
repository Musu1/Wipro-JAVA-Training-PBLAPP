import java.util.*;
import java.util.Map.*;

public class Map2{
	public static void main(String args[]){
		HashMap<String,String> m=new HashMap<>();

		m.put("India","Delhi");
		m.put("China","Kathmandu");
		m.put("Nepal","Kathmandu");

		Set<Entry<String,String>> s=m.entrySet();
		Iterator<Entry<String,String>> i=s.iterator();

		while(i.hasNext()){
			Map.Entry<String,String> m1=i.next();
			if(m1.getKey().equals("India")){
				System.out.println("Key India exists");
				break;
			}
		}

		s=m.entrySet();
		i=s.iterator();
		 while (i.hasNext()) {
			Map.Entry<String, String> m1 = i.next();
			
			if (m1.getValue().equals("Delhi")) {
				System.out.println("Value Delhi exists");
				break;
			}
		}

		s=m.entrySet();
		i=s.iterator();
		while(i.hasNext()){
			Map.Entry<String,String> m1=i.next();
			System.out.println(m1);
		}
	}
}