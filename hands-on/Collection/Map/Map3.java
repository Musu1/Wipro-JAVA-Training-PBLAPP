import java.util.*;
import java.util.Map.*;

public class Map3{
	public static void main(String args[]){
		Properties p=new Properties();
		p.setProperty("Rajasthan","Jaipur");
		p.setProperty("Bihar","Patna");
		p.setProperty("Gujarat","Gandhinagar");
	
		Set<Entry<Object,Object>> s=p.entrySet();
		Iterator<Entry<Object,Object>> i=s.iterator();
		
		while(i.hasNext()){
			Entry<Object,Object> m=i.next();
			System.out.println(m);
		}
}}